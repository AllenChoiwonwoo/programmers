/**
 * create on 2022/09/24.
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

package kakao202209;


import java.text.SimpleDateFormat;
import java.util.*;

/**
 * create on 2022/09/24.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @author allen
 * @version 1.0
 * @name : 2023 KAKAO BLIND RECRUITMENT 1차 코딩테스트
 * @see
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
public class P1_1 {

	public int[] solution(String today, String[] terms, String[] privacies){
		List<Integer> result = new ArrayList<>();
		Map<String, String> termsMap = new HashMap<>();
		String[] splitToday = today.split("\\.");
		Calendar Ctoday = Calendar.getInstance();
		Ctoday.set(Integer.parseInt(splitToday[0]), Integer.parseInt(splitToday[1]) -1, Integer.parseInt(splitToday[2]));
		Calendar pDate = Calendar.getInstance();

		for (String term : terms) {
			termsMap.put(term.split(" ")[0], term.split(" ")[1]);
		}

		int year = 0;
		int month = 0;
		int day = 0;

		for (int i = 0; i < privacies.length; i++) {
			String[] split = privacies[i].split(" ");
			String privacyDate = split[0];
			String privacyType = split[1];
			String limitMonth = termsMap.get(privacyType);
			String[] split1 = privacyDate.split("\\.");
			year = Integer.parseInt(split1[0]);
			month = Integer.parseInt(split1[1]);
			day = Integer.parseInt(split1[2]) -1; //todo : -1 을 하는것과 >= 을 쓰는것의 차이가 뭘까?


			pDate.set(year, month, day);
			pDate.add(Calendar.MONTH, Integer.parseInt(limitMonth)-1);
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
//			String newDate1  = sdf.format(Ctoday.getTime());
//			String newDate2 = sdf.format(pDate.getTime());
//			System.out.println("!P1_1:62 = newDate1 " + newDate1 +" , newDate2 " + newDate2);
			if ( Ctoday.compareTo(pDate) > 0){
				result.add(i+1);
			}

		}
//		System.out.println("result = " + result);
		int[] answer = new int[result.size()];
		for (int i = 0; i < result.size() ; i++) {
			answer[i] = result.get(i);
		}

		return answer;
	}


	public static void main(String[] args) {
		P1_1 p1 = new P1_1();
		String today = "2022.05.19";
//		Calendar cal1 = Calendar.getInstance();
//		cal1.set(Integer.parseInt(today.split("\\.")[0]), Integer.parseInt(today.split("\\.")[1]), Integer.parseInt(today.split("\\.")[2]));
//		cal1.add(Calendar.MONTH, 11);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
//		String newDate  = sdf.format(cal1.getTime());
//		System.out.println("!P1_1:80 = " +newDate);
//		System.out.println("!P1_1:84 = " , );
//
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		p1.solution(today, terms, privacies);
		today = "2020.01.01";
		terms = new String[]{"Z 3", "D 5"};
		privacies = new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
		p1.solution(today, terms, privacies);
	}
}
