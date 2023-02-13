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
//
//	}
	// 리트코드 twosum
}
