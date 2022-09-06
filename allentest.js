function makeDateClick() {
    var dateBtn = document.getElementById('dateSelect_20220917');
    if (dateBtn){
        console.log('btn okey');
        dateBtn.click();
        makeBookingClk();
        // setTimeout(() => {
        //     document.getElementById('ticketReservation_Btn').click();
        // }, 10);
    }else{
        console.log('try again after 50');
        setTimeout(() =>{
            makeDateClick()
        }, 50);
    }
}

function makeBookingClk() {
    var dateBtn = document.getElementById('dateSelect_20220917');
    var classStrs = dateBtn.getAttribute('class').split(' ');
    if(dateBtn && classStrs.indexOf('on') > 0){
        setTimeout(() => {
            console.log('clk booking');
            document.getElementById('ticketReservation_Btn').click();
        }, 150);
    }else{
        console.log('book try again');
        setTimeout(() => {
            makeBookingClk();
        }, 30)
    }
}




var targetTime = new Date('2022-08-08 20:00:00:500');
function checkTime(targetTime) {
    if (Date.now() > targetTime){
        makeDateClick();
    }else{
        setTimeout(() => {
            checkTime(targetTime);
        }, 80);
    }
}
checkTime(targetTime);

// makeDateClick();


// {
//     "adType" : "banner",
//         "apiVer" : "15.2",
//         "areaIdx" : "4d1c5d99-777c-493c-960f-d04d9a86dbb9",
//     "country" : "ZM",
//     "cuid" : "YOUR ENCRYPTED ID 1",
//     "fcVer" : "4.4.0.0",
//     "fncVer" : "4.4.0.0",
//     "fp" : "30",
//     "id" : "C0929CCC-E91B-4085-9B70-E356B62A9904",
//     "logType" : "noshow",
//     "modelNm" : "iPhone 7 Plus",
//     "networkIdx" : "f797ee95-1172-11ed-a117-026864a21938",
//     "networkNm" : "Prebid" ,
//     "obhVer" : "4.4.0.1",
//     "order" : 1,
//     "originIdx" : "4d1c5d99-777c-493c-960f-d04d9a86dbb9",
//     "p" : "i",
//     "packageNm" : "com.adop.mnctest",
//     "param" : "allentest/response-prebid-banner-320-50",
//     "sdkVer" : "4.4.0.0",
//     "sessionId" : "AC2CE4F1-F3A2-4F59-B2F7-BC64651C2C8C",
// }