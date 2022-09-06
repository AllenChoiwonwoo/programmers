<?php
require 'vendor/autoload.php';

ini_set('memory_limit', '2048M');
ini_set('max_execution_time', 60 * 60 * 2);
date_default_timezone_set('UTC');
define('DB_HOST', 'compass-cluster.cluster-cnzcxy7quzcs.ap-northeast-2.rds.amazonaws.com');

$job_start_date = date('Y-m-d H:i:s', strtotime("+9 hours"));

$utc_dt = date('Y-m-d H:i:s');
$now = date('YmdH', strtotime("+8 hours"));
//$year = substr($now, 0, 4);
//$month = substr($now, 4, 2);
//$day = substr($now, 6, 2);
//$hour = substr($now, 8, 2);
$com_conn = mysqli_connect(DB_HOST, 'adopadmin', 'Adop*^14', 'platon');
if (mysqli_connect_errno()) {
    die("콤파스 디비연결 실패!!" . mysqli_connect_error());
}
mysqli_query($com_conn, "set names utf8");

$coSQL = " SELECT area_idx, com_idx FROM inventory_area WHERE del_yn = 'N'";
$area_list_tmp = mysqli_query($com_conn, $coSQL);
$area_list = $area_list_tmp->fetch_all(MYSQLI_ASSOC);

foreach ($area_list as $row) {
    $area_idxs[$row['area_idx']]['com_idx'] = $row['com_idx'];
}
$year = '2022';
$month = '08';
$day = '25';
$hour = '01';

require_once 'vendor/autoload.php';

use Aws\Athena\AthenaClient;

$client = AthenaClient::factory(array(
    'version' => 'latest',
    'region' => 'ap-northeast-2',
    'profile' => 'CMW'
));

$sel = $client->StartQueryExecution(
    array(
        "QueryExecutionContext" => array("Database" => "log"),
        "QueryString" => "
                SELECT zid as area_idx, aid as adv_idx, concat(year,'-',month,'-',day,' ',hour,':00:00') as search_date, 
                        count(case when type ='imp' then 1 end) as impr,
                        count(case when type ='clk' then 1 end) as click,
                        count(case when type ='res' then 1 end) as res
                FROM log.compass_log
                WHERE year = '" . $year . "'
                AND month = '" . $month . "'
                AND day = '" . $day . "'
                AND hour = '" . $hour . "'
                AND type in ('imp', 'clk', 'res')
                GROUP BY zid, aid, year, month, day, hour
             ",
        "ResultConfiguration" => array(
            "EncryptionConfiguration" => array("EncryptionOption" => "SSE_S3"),
            "OutputLocation" => "s3://aws-athena-query-results-441075904564-ap-northeast-2"
        )
    )
);
$i = 0;
while (++$i <= 10) {
    sleep(10);
    $result = $client->getQueryExecution(array('QueryExecutionId' => $sel->get('QueryExecutionId')));
    $res = $result->toArray();

    if ($res['QueryExecution']['Status']['State'] == 'FAILED') {
        echo 'Query Failed';
        die;
    } else if ($res['QueryExecution']['Status']['State'] == 'CANCELED') {
        echo 'Query was cancelled';
        die;
    } else if ($res['QueryExecution']['Status']['State'] == 'SUCCEEDED') {
        break; // break while loop
    } else {
        if ($i == 10) {
            var_dump($result);
        }
    }

}
$job_exe_id = $sel->get('QueryExecutionId');
$result1 = $client->GetQueryResults(array(
    'QueryExecutionId' => $sel->get('QueryExecutionId')
));

$get_rst[0] = $result1->toArray();
for ($i = 0; $i <= 10; $i++) {
    if (isset($get_rst[$i]['NextToken'])) {
        $get_rst[$i + 1] = $client->GetQueryResults(array(
            'QueryExecutionId' => $job_exe_id,
            'NextToken' => $get_rst[$i]['NextToken']
        ));
    } else {
        break;
    }
}
$job_tar_date = '';
for ($i = 0; $i < count($get_rst); $i++) {
    foreach ($get_rst[$i]['ResultSet']['Rows'] as $key => $row) {
        if ($i == 0 && $key == 0) {
            $column_tmp[0] = $row['Data'][0]['VarCharValue'];//area_idx
            $column_tmp[1] = $row['Data'][1]['VarCharValue'];//adv_idx
            $column_tmp[2] = 'com_idx';
            $column_tmp[3] = $row['Data'][2]['VarCharValue'];//search_date(UTC+9된 시간)
            $column_tmp[4] = $row['Data'][3]['VarCharValue'];//impr
            $column_tmp[5] = $row['Data'][4]['VarCharValue'];//click
            $column_tmp[6] = $row['Data'][5]['VarCharValue'];//res
            $column_tmp[7] = 'reg_date';
        } else {
            foreach ($row as $row2) {
                $job_tar_date = date("Y-m-d H:i:s", strtotime("-9 hours", strtotime($row2[2]['VarCharValue'])));
                $vals_tmp[] = sprintf("('%s','%s','%s','%s','%s','%s','%s','%s') ", $row2[0]['VarCharValue'], $row2[1]['VarCharValue'], $area_idxs[$row2[0]['VarCharValue']]['com_idx'], $job_tar_date, $row2[3]['VarCharValue'], $row2[4]['VarCharValue'], $row2[5]['VarCharValue'], $utc_dt);
            }
        }
    }
}

$column = join(",", $column_tmp);
$vals = join(",", $vals_tmp);

$_LOGDB = mysqli_connect("compasslog-cluster.cluster-cnzcxy7quzcs.ap-northeast-2.rds.amazonaws.com", "adopadmin", "Adop*^14", "platon_log");
if ($_LOGDB->connect_errno) {
    die('Connect Error: ' . $_LOGDB->connect_error);
}
$strSQL = " INSERT INTO compass_log_live ( " . $column . " ) VALUES " . $vals . " ON DUPLICATE KEY UPDATE impr = VALUES(impr), click = VALUES(click), res = VALUES(res)";
echo $strSQL;
$rs = $_LOGDB->query($strSQL);
$_LOGDB->close();
/*
$_LOGALLDB = mysqli_connect("compass-log-all-cluster.cluster-cnzcxy7quzcs.ap-northeast-2.rds.amazonaws.com", "adopadmin", "Adop*^14", "adop_dmp");
if ($_LOGALLDB->connect_errno) {
    die('Log-all DB Connect Error: ' . $_LOGALLDB->connect_error);
}
$job_end_date = date('Y-m-d H:i:s', strtotime("+9 hours"));

if($rs){
    $job_name = 'compass_log_live';
}else{
    $job_name = 'compass_log_live fail';
}
$logSQL = " INSERT INTO compass_log_history (job_name, job_tar_date, job_exe_id, job_start_date, job_end_date) VALUE ('".$job_name."', '".$job_tar_date."', '".$job_exe_id."', '".$job_start_date."','".$job_end_date."')";
$_LOGALLDB->query($logSQL);
$_LOGALLDB->close();
*/