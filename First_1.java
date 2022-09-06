/**
 * create on 2022/07/20.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @version 1.0
 * @author allen
 * @see
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */

import java.lang.reflect.Array;
import java.util.*;

/**
 * create on 2022/07/20.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @see
 * @version 1.0
 * @author allen
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 * @url https://school.programmers.co.kr/learn/courses/30/lessons/92334
 * @title 신고 결과 받기 (from kakao)
 */
public class First_1 {
	static String[] id_list = {"muzi", "frodo", "apeach", "neo"};
	static String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
	static int k = 2;
	public static void main(String[] args) {
		/*
		int[] answer = new int[id_list.length];
		List<String> ids = Arrays.asList(id_list);
		Arrays.fill(answer, 0);
		Set<String> reportSet = new HashSet<>(Arrays.asList(report));
		Map<String, List<String>> warnedMap = new HashMap<>();
		for (String item : reportSet) {
			String reporter = item.split(" ")[0];
			String warnner = item.split(" ")[1];
			if (!warnedMap.containsKey(warnner)){
				warnedMap.put(warnner, new ArrayList<>(Arrays.asList(reporter)));// add 메서드를 사용하려면 new ArrayList 를 형변환 해야한다.
				continue;
			}
			List<String> list = warnedMap.get(warnner);
			list.add(reporter);
		}

		for (String reporter : id_list) {
			for (String warnner: warnedMap.keySet()) {

				List<String> reporterList = warnedMap.get(warnner);
				if (reporterList.contains(reporter) && reporterList.size() >= 2){
					answer[ids.indexOf(reporter)]++;
				}
			}
		}

		System.out.println("answer = " + answer.toString());
		for (int i = 0; i < answer.length; i++) {
			System.out.println("answer[i] = " + answer[i]);
		}
		 */

		int[] answer = new int[id_list.length];
		ArrayList<User> users = new ArrayList<>();
		HashMap<String,Integer> suspendedList = new HashMap<>(); //<이름>
		HashMap<String,Integer> idIdx = new HashMap<String,Integer>(); // <이름, 해당 이름의 User 클래스 idx>
		int idx = 0;

		for(String name : id_list) {
			idIdx.put(name,idx++);
			users.add(new User(name));
		}

		for(String re : report){
			String[] str = re.split(" ");
			//suspendedCount.put(str[0], suspendedCount.getOrDefault(str[0],0)+1);
			users.get( idIdx.get(str[0])).reportList.add(str[1]);
			users.get( idIdx.get(str[1])).reportedList.add(str[0]);
		}
		for (User user: users) {
			System.out.println("user = " + user);
		}
		for(User user : users){
			if(user.reportedList.size() >= k)
				suspendedList.put(user.name,1);
		}
		System.out.println("suspendedList = " + suspendedList);
	}

}
class User{
	String name;
	HashSet<String> reportList;
	HashSet<String> reportedList;
	public User(String name){
		this.name = name;
		reportList = new HashSet<>();
		reportedList = new HashSet<>();


	}
	public String toString(){
		return name + " , "+reportList.toString() +" , "+ reportedList.toString();
	}
}
/*
휴기 :
1. 문제 상황을 분리해서 먼저구획하고
	각 구획에서 필요한 데이터를 먼저 생각하는 작업이 부족했다.
2. class 를 사용할 생각을 못했다 -> 객체지향
3. stream 을 사용하면 좋겠다.

 */
