/**
 * create on 2023/03/08.
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
import java.util.StringTokenizer;

/**
 * create on 2023/03/08.
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
public class bj12891 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		int dnaLength = Integer.parseInt(stringTokenizer.nextToken()); // DNA 문자열의 길이
		int dnaPartLength = Integer.parseInt(stringTokenizer.nextToken()); // DNA 부분 문자열의 길이

		stringTokenizer = new StringTokenizer(br.readLine());
		String dna = stringTokenizer.nextToken(); // DNA 문자열
//		String dna = "GATA";
		char[] danCharArr = dna.toCharArray();

//		char[] dnaCharArr = new char[]{ 'A', 'C', 'G', 'T'};
//									     2    0    1    1
		int[] dnaCntStandardArr = new int[4];
		int[] dnaCnt = new int[4];

		stringTokenizer = new StringTokenizer(br.readLine());
		for (int i = 0; i < dnaCntStandardArr.length; i++) {
			dnaCntStandardArr[i] = Integer.parseInt(stringTokenizer.nextToken());
		}


		int result = 0;
		int start = 0;
		int end = dnaPartLength;

		while (end <= dnaLength) {
			boolean isValied = true;
//			String temp = dna.substring(start, end); 1 2 3 4
			for (int i = start; i < end; i++) {
				switch (danCharArr[i]) {
					case 'A':
						dnaCnt[0]++;
						break;
					case 'C':
						dnaCnt[1]++;
						break;
					case 'G':
						dnaCnt[2]++;
						break;
					case 'T':
						dnaCnt[3]++;
						break;
				}
			}

			for (int i = 0; i < 4; i++) {
				if (dnaCnt[i] < dnaCntStandardArr[i]) {
					isValied = false;
				}
			}
			if (isValied) {
				result++;
			}
			start++;
			end++;
			dnaCnt = new int[4];
		}

		System.out.println(result);

	}
}
