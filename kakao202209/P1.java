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
public class P1 {

	public int[] solution(String today, String[] terms, String[] privacies) {
		List<Integer> result = new ArrayList<>();
		DateClass todayDate = new DateClass(today, "");
		Map<String, String> termsMap = new HashMap<>();

		for (String term : terms) {
			termsMap.put(term.split(" ")[0], term.split(" ")[1]);
		}
		for (int i = 0; i < privacies.length; i++) {
			DateClass onePrivacy = new DateClass(privacies[i].split(" ")[0], privacies[i].split(" ")[1]);
			String limitMonth = termsMap.get(onePrivacy.type);
			onePrivacy.addMonth(limitMonth);
			System.out.println("limitMonth = " + limitMonth);
			System.out.println("todayDate = "+todayDate.strDate + ", onePrivacy = " + onePrivacy.strDate);
			if(checkOverDate(todayDate, onePrivacy)){
				result.add(i+1);
			}
		}
		System.out.println(result);
		int[] answer = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
		return answer;
	}
	// 두개을 날짜 문자열이 주어질때 대소 비교
	// 2021.01.01 2021.01.02
	// 2021.01.01 2021.01.01
//	public boolean compareDate(DateClass date1, DateClass date2) {
//		Calendar cal1 = Calendar.getInstance();
//		cal1.set(date1.year, date1.month, date1.day > 28 ? 28 : date1.day);
//		Calendar cal2 = Calendar.getInstance();
//		cal2.set(date2.year, date2.month, date2.day > 28 ? 28 : date2.day);
//		return cal1.compareTo(cal2) >= 0;
//	}
	boolean checkOverDate(DateClass today, DateClass imputDate) {
		if (today.year > imputDate.year) {
			return true;
		} else if (today.year == imputDate.year) {
			if (today.month > imputDate.month) {
				return true;
			} else if (today.month == imputDate.month) {
				if (today.day >= imputDate.day) {
					return true;
				}
			}
		}
		return false;
	}

		class DateClass {
		int year;
		int month;
		int day;
		String type;
		String strDate;

		public DateClass(String date, String type) {
			String[] split = date.split("[.]");
			this.year = Integer.parseInt(split[0]);
			this.month = Integer.parseInt(split[1]);
			this.day = Integer.parseInt(split[2]);
			this.type = type;
			this.strDate = date;
		}


		 void addMonth(String inputMonth) {
			int sumMonth = this.month + Integer.parseInt(inputMonth);
			if (sumMonth >= 12) {
				this.year+=(sumMonth/12);
				this.month = sumMonth%12 == 0 ? 12 : sumMonth%12;
			}else{
				this.month = sumMonth;
			}
			this.strDate = this.year + "." + this.month + "." + this.day;
		}



	}


	public static void main(String[] args) {
		P1 p1 = new P1();
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		p1.solution(today, terms, privacies);
		today = "2020.01.01";
		terms = new String[]{"Z 3", "D 5"};
		privacies = new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
		p1.solution(today, terms, privacies);
	}
}
