/**
 * create on 2022/08/29.
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

import java.util.Arrays;

/**
 * create on 2022/08/29.
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
public class eleven {

	// 정수를 이진수로 변환하라
	public String getBinaryString(int N , int mylength) {
		StringBuilder sb = new StringBuilder();
		while (N > 0) {
			sb.append(N % 2 );
			N = N / 2;
		}
//		System.out.println("sb.toString() = " + sb.toString());
		// 만약 N의 갈이가 5보다 작다면 앞에 0을 채워라
		if (sb.length() < mylength) {
			int zoroCnt =  mylength - sb.length();
			for (int i = 0; i < zoroCnt; i++) {
				// sb 의 앞에 0을 삽입하라
				sb.append(0);
			}
		}
		return sb.reverse().toString();
	}

	public String addTwoBinary(String binary1, String binary2) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < binary1.length(); i++) {
			if (binary1.charAt(i) == '0' && binary2.charAt(i) == '0') {
				sb.append(" ");
			} else {
				sb.append("#");
			}
		}
		return sb.toString();
	}


	public String[] process(int n, int[] arr1, int[] arr2){
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			result[i] = addTwoBinary(getBinaryString(arr1[i], n), getBinaryString(arr2[i], n));
		}
		return result;
//		return new String[]{getBinaryString(arr1[0], n)};


	}

	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};

		eleven eleven = new eleven();
		String[] process = eleven.process(n, arr1, arr2);
		Arrays.asList(process).forEach(System.out::println);
//		System.out.println();
//		System.out.println(eleven.getBinaryString(46,6));
//		System.out.println(eleven.getBinaryString(27,6));
//
//
//		System.out.println("Integer.toBinaryString(46); = " + Integer.toBinaryString(46));
//		System.out.println("Integer.toBinaryString(27); = 0" + Integer.toBinaryString(27));



	}
}
