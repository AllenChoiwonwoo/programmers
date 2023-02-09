/**
 * create on 2023/01/31.
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

package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * create on 2023/01/31.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @author allen
 * @version 1.0
 * @see
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
public class bj11659 {
	// 구간의 합을 구하고자한다.
	// 2개의 숫자를 입력 받는다.
	// 1번째 숫자는 데이터의 개수
	// 2번째 숫자는 질의 개수
	// 1번째 숫자를 길이로 갖는 대상대열을 입력받는다.
	// 2개의 숫자를 입력받고 1번째 숫자부터 2번째 숫자까지의 합을 구한다.
	private static int[] arr;
	private static int[] sum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		System.out.println("suNo = " + suNo);
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		System.out.println("quizNo = " + quizNo);
		long[] arr = new long[suNo + 1]; // idx를 , 0 비우고 ,
		stringTokenizer = new StringTokenizer(br.readLine());
		for (int i = 1; i <= suNo; i++) {
			arr[i] = arr[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
			System.out.println("arr = " + arr[i]);
		}
		for (int k = 0; k < quizNo; k++){
			stringTokenizer = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println("!bj11659:57 = " + (arr[j] - arr[i -1]));
		}




		// 자바의 소트는 log n 이다.
		// 코드중에 가장 시간 복잡도가 높은 놈으로 시간복잡도를 평가한다.


	}
//	public static void main(String[] args) {
//		int[] arr = new int[]{1, 1, 1, 3, 3, 2};
//		int[] indexs = new int[arr.length];
//
//		Map<Integer, Integer> map = new HashMap<>();
//
//		for (int i : arr) {
//			map.put(i, map.getOrDefault(i, 0) + 1);
//		}
//
//		map.entrySet().stream().sorted(((o1, o2) -> o1.getValue() > o2.getValue() ? -1 : 1)).map(i -> i.getKey()).forEach(System.out::println);
//
//	}
	// 리트코드 twosum
}
