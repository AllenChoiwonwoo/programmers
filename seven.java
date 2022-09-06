/**
 * create on 2022/08/22.
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

import com.ibm.jvm.j9.dump.extract.Main;

import java.util.HashMap;
import java.util.Map;

/**
 * create on 2022/08/22.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @see
 * @version 1.0
 * @author allen
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 * @url https://school.programmers.co.kr/learn/courses/30/lessons/118666?language=java
 */
public class seven {
	public static char[] getFirstAndSecondChar(String input){
		char[] result = new char[2];
		result[0] = input.charAt(0);
		result[1] = input.charAt(1);
		return result;
	}

	public static void main(String[] args) {
		String[] servey1 = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		// "TCMA"

		Map<Integer, Integer> scoreMap= new HashMap<Integer,Integer>();
		scoreMap.put(1,3);
		scoreMap.put(2,2);
		scoreMap.put(3,1);
		scoreMap.put(4,0);
		scoreMap.put(5,1);
		scoreMap.put(6,2);
		scoreMap.put(7,3);

		Map<String, Integer> scoreTable = new HashMap<String, Integer>();
		scoreTable.put("R",0);
		scoreTable.put("T",0);
		scoreTable.put("C",0);
		scoreTable.put("F",0);
		scoreTable.put("J",0);
		scoreTable.put("M",0);
		scoreTable.put("A",0);
		scoreTable.put("N",0);

//		for (int i = 0; i < servey1.length; i++) {
//			String servey = servey1[i];
//			int score = scoreMap.get(choices[i]);
//			for (int j = 0; j < servey.length(); j++) {
//				String key = servey.substring(j,j+1);
//				scoreTable.put(key, scoreTable.get(key)+score);
//			}
//		}


		for (int i = 0; i < servey1.length ; i++) {
			char[] chars = getFirstAndSecondChar(servey1[i]);
			// if choices value is 4 , do continue
			if(choices[i] == 4) continue;

			// if choices value is smaller than 4, add score to first char
			// else add score to second char
			if(choices[i] < 4) {
				scoreTable.put(String.valueOf(chars[0]), scoreTable.get(String.valueOf(chars[0])) + scoreMap.get(choices[i]));
			} else {
				scoreTable.put(String.valueOf(chars[1]), scoreTable.get(String.valueOf(chars[1])) + scoreMap.get(choices[i]));
			}


//			if (choices[i] == 4){
//				continue;
//			}
//			Integer sum=0;
//			if (choices[i] < 4){
//				// 앞의 글자에 점수 +
//				 sum = scoreTable.get(first)+scoreMap.get(choices[i]);
//				scoreTable.put(first,sum);
//			}else{
//				// 뒤의 글자에 점수 +
//				 sum = scoreTable.get(second)+scoreMap.get(choices[i]);
//				scoreTable.put(second,sum);
//			}
			// 단, 하나의 지표에서 각 성격 유형 점수가 같으면, 두 성격 유형 중 사전 순으로 빠른 성격 유형을 검사자의 성격 유형이라고 판단합니다.
		}

		// return first and second char of input string

		// get String
		// if R of scoreTable >= T return R else T
		// if C of scoreTable >= F return C else F
		// if J of scoreTable >= M return J else M
		// if A of scoreTable >= N return A else N
		String result = "";
		result += scoreTable.get("R") >= scoreTable.get("T") ? "R" : "T";
		result += scoreTable.get("C") >= scoreTable.get("F") ? "C" : "F";
		result += scoreTable.get("J") >= scoreTable.get("M") ? "J" : "M";
		result += scoreTable.get("A") >= scoreTable.get("N") ? "A" : "N";
		System.out.println(result);



//		// r t
//		String personalityType = "";
//		personalityType += scoreTable.get("R") >= scoreTable.get("T") ? "R" : "T";
//		personalityType += scoreTable.get("C") >= scoreTable.get("F") ? "C" : "F";
//		personalityType += scoreTable.get("J") >= scoreTable.get("M") ? "J" : "M";
//		personalityType += scoreTable.get("A") >= scoreTable.get("N") ? "A" : "N";
//
//		System.out.println("personalityType = " + personalityType);


	}

//	public static void main(String[] args) {
//		char a = 'A';
//		char b = 'B';
//		System.out.println("a > b");
//		System.out.println(a > b);
//	}
}
