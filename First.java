///**
// * create on 2022/07/18.
// * create by IntelliJ IDEA.
// *
// * <p> 클래스 설명 </p>
// * <p> {@link } and {@link }관련 클래스 </p>
// *
// * @version 1.0
// * @author allen
// * @see
// * @since 지원하는 자바버전 (ex : 5+ 5이상)
// */
//
//import java.util.*;
//
///**
// * create on 2022/07/18.
// * create by IntelliJ IDEA.
// *
// * <p> 클래스 설명 </p>
// * <p> {@link } and {@link }관련 클래스 </p>
// *
// * @see
// * @version 1.0
// * @author allen
// * @since 지원하는 자바버전 (ex : 5+ 5이상)
// */
//public class First {
//
//	public static void main(String[] args) {
//		try {
//			String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//			String [] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
//			int k = 2;
//			System.out.println("id_list = " + id_list.toString());
//
//			/*
//			신고한 모든 유저에게 정지 사실 발송
//			        취합 후 한번ㅔ 정지 이메일발송
//			한명의 유저는 같은 유저를 중복 신고 못한다.
//
//			Map 에 유저별 키 : Array 생성
//			Array 에 피신고자 넣기,
//				if 같은 신고자면 안넣기
//			map 의 key별 array.size 구해 배열에 넣고
//			내림차순 소팅
//
//
//			신고 리스트 중복제거
//			신고 당한자 키 , array[신고자] => 정지 유뮤, 정시 시킨사람
//
//			유저 list 를 for 문 돌면서
//
//
//			팅*/
//			List<String> outUsers  = new ArrayList<>(); // 나가리 리스트
//			HashMap<String, List<String>> reportersByUser = new HashMap<>(); // 나가리 : 신고자들 리스트
//			HashSet<String> arr2 = new HashSet<String>(List.of(report));
//			for (String rp: arr2) {
//				String[] sp_rp = rp.split(" ");
//				String warnedUser = sp_rp[1];
//				String reporter = sp_rp[0];
//				if (reportersByUser.containsKey(warnedUser)){
//					reportersByUser.get(warnedUser).add(reporter);
//					if (reportersByUser.get(warnedUser).size() >= 2 && outUsers.indexOf(warnedUser) == -1){
//						outUsers.add(warnedUser);
//					}
//				}else{
//					List<String> reporters = new ArrayList();
//					reporters.add(reporter);
//					reportersByUser.put(warnedUser, reporters);
//				}
//			}
//			List<Integer> result = new ArrayList<Integer>();
//			HashMap<String, List<String>> warnerCountByUser = new HashMap<>();
//			for (String id: id_list) {
//				int cnt = 0;
//				for (String warnner: reportersByUser.keySet()) {
//					List<String> reporterss = reportersByUser.get(warnner);
//					if (reporterss.contains(id)) cnt++;
//				}
//				result.add(cnt);
//			}
//
//			System.out.println("result = " + result);
//			int[] test = new int[result.size()];
//			for (int i = 0; i < test.length; i++) {
//				test[i] = result.get(i);
//			}
//
//
//
//
//
//
//			System.out.println("answer = " + test);
//		}catch (Exception e){
//			e.printStackTrace();
//		}
//
//
//	}
//}
//
