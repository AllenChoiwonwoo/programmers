/**
 * create on 2023/02/09.
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
 * create on 2023/02/09.
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
public class bj11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
//		System.out.println("suNo = " + suNo);
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
//		System.out.println("quizNo = " + quizNo);
		int[][] metrix = new int[suNo][suNo];
		int yidx = 0;
		for (int i = 0; i <  suNo ; i++) {
			stringTokenizer = new StringTokenizer(br.readLine());
			int xidx = 0;
			for (int j = 0; j < suNo; j++) {
				int input = Integer.parseInt(stringTokenizer.nextToken());
				metrix[yidx][xidx] = input;
				xidx++;
			}
			yidx++;
		}

		for (int i = 0; i < quizNo; i++) {
			stringTokenizer = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(stringTokenizer.nextToken());
			int y1 = Integer.parseInt(stringTokenizer.nextToken());

			int x2 = Integer.parseInt(stringTokenizer.nextToken());
			int y2 = Integer.parseInt(stringTokenizer.nextToken());
			int result = 0;
			for (int j = y1-1; j < y2; j++){
				for (int k = x1-1; k < x2; k++) {
					result += metrix[j][k];
				}
			}
			System.out.println(result);

		}
		
		
		// metrix 이차원 배열을 출력
//		for (int i = 0; i < suNo; i++) {
//			for (int j = 0; j < suNo; j++) {
//				System.out.print(metrix[i][j] + " ");
//			}
//			System.out.println();
//		}

	}
}
