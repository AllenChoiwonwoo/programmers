/**
 * create on 2022/07/27.
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


import java.util.HashMap;
import java.util.Map;

/**
 * create on 2022/07/27.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @see
 * @version 1.0
 * @author allen
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
public class fourth {
	static String value1 = "zero4seveneight";	// 1478
	static String value2 = "23four5six7";	// 234567
	static String value3 = "2three45sixseven";	// 234567
	static String value4 = "120383";	// 123
	static String value6 = "77zero";	// 777 // 77six77 , 8877zerosix


	static String value5 = "seveneightseven";

	public fourth() {
	}

	public static String allenNewMethod(String input, Map<String, String> map) {


		String result = "";
		String numbers = "0123456789";
		boolean isNumb = true;
		String firstStr = null;
		if (input.replaceAll("[0-9]", "").length() == 0) return input;
		if (input.replaceAll("[a-z]", "").length() == 0) {
			for (String key : map.keySet()) {
				input = input.replaceAll(key, map.get(key));
			}
			return input;
		}
		System.out.println("input = " + input);
		while (input.length() > 0) {
			firstStr = String.valueOf(input.charAt(0));
			isNumb = numbers.indexOf(firstStr) > -1 ? true : false;
			System.out.println("isNumb = " + isNumb);

			if (isNumb) {
				System.out.println("firstStr = " + firstStr);
				result+=firstStr;
				System.out.println("result = " + result);
				System.out.println("b input = " + input);
				input = input.substring(1,input.length());
				System.out.println("a input = " + input);
//				break;

			} else {
				for (String key : map.keySet()) {
					int endIdx = Math.min(input.length(), 5);
					String subStr = input.substring(0, endIdx);
					String modiInput = subStr.replace(key, "");
					if (modiInput.length() != endIdx) {
						result = result + map.get(key);
						input = input.substring(endIdx - modiInput.length());
						break;
					}
				}
			}
		}
		int allen = Integer.parseInt(result);
		
		return result;
	}

	public static void main(String[] args) {
//		String input = "4zero12two";
//		input.replace("4", "");
//
////		input = input.substring(4);
//		System.out.println("input = " + input);
//		if (true) return;

		String result = "";
		Map<String, String> numbNameMap = new HashMap<>();
		numbNameMap.put("zero", "0");
		numbNameMap.put("one", "1");
		numbNameMap.put("two", "2");
		numbNameMap.put("three", "3");
		numbNameMap.put("four", "4");
		numbNameMap.put("five", "5");
		numbNameMap.put("six", "6");
		numbNameMap.put("seven", "7");
		numbNameMap.put("eight", "8");
		numbNameMap.put("nine", "9");
		System.out.println("val = " + value6);
		result = allenNewMethod(value6, numbNameMap);
		System.out.println("result = " + result);
		
//		String strallen = "oneallentest";
//		strallen = strallen.replace("one","");
//		System.out.println("strallen = " + strallen);
		/*
		String[] numbArr = value1.split("[a-z]+");
		String[] strArr = value1.split("[0-9]+");
		System.out.println("numbArr = " + Arrays.asList(numbArr));
		System.out.println("strArr = " + Arrays.asList(strArr));
		int numbArrIdx = 0;
		int strArrIdx = 0;
		int arrLength = Math.max(numbArr.length, strArr.length);
		char firstStr = value1.charAt(0);
		boolean isNumb = "0123456789".contains(String.valueOf(firstStr));
		if (isNumb){
			strArrIdx++;
		}else {
			numbArrIdx++;
		}
		for (int i = 0; i < arrLength; i++) {
			if (!isNumb){ // 문자부터 시작됨
				result =result+strArr[strArrIdx];
				strArrIdx++;
				if (arrLength == numbArrIdx) break;
				result = result+numbArr[numbArrIdx];
				numbArrIdx++;
			}else{ // 숫자부터 시작됨
				result = result+numbArr[numbArrIdx];
				numbArrIdx++;
				if (arrLength == strArrIdx) break;
				result = result+strArr[strArrIdx];
				strArrIdx++;
			}
		}
		System.out.println("result = " + result);
		*/

		/*
		각문자별 포문
			문자인지 숫지인지 확인
			if숫자면 해당숫자빼기
			else 숫자가 아니면 해당인덱스부터 5번째 문자와 map 의 숫자
			해당 숫자 빼서 결과 문자열 더하기
		 */
	}
}
