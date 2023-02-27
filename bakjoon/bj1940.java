/**
 * create on 2023/02/27.
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
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * create on 2023/02/27.
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
public class bj1940 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		int mCnt = Integer.parseInt(stringTokenizer.nextToken()); // 재료 개수
//		System.out.println("mCnt = " + mCnt);
		stringTokenizer = new StringTokenizer(br.readLine());
		int targetNum = Integer.parseInt(stringTokenizer.nextToken()); // 목표 번호 합
//		System.out.println("targetNum = " + targetNum);
		int[] arr = new int[mCnt + 1]; // idx를 , 0 비우고 ,
		stringTokenizer = new StringTokenizer(br.readLine());
		for (int i = 1; i <= mCnt; i++) {
			arr[i] = Integer.parseInt(stringTokenizer.nextToken());
//			System.out.println("arr = " + arr[i]);
		}

		// arr 를 내림차운으로 정렬한다.
		Arrays.sort(arr);
		int start = 1;
		int end = mCnt;
		int answer = 0;
		int sum = 0;

		while (start < end){
			sum = arr[start]+arr[end];
//			System.out.println("start = " +start +" , end= "+end+" , sum= "+sum);
			if (sum == targetNum){
				answer++;
				start++;
				end--;
			} else if (sum > targetNum) {
				end--;
			} else if (sum < targetNum) {
				start++;
			}
		}
		System.out.println(answer);
		br.close();
	}
}
