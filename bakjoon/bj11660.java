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
		int[][] metrix = new int[suNo+1][suNo+1];
		for (int i = 0; i <  suNo ; i++) {
			stringTokenizer = new StringTokenizer(br.readLine());
			for (int j = 0; j < suNo; j++) {
				int input = Integer.parseInt(stringTokenizer.nextToken());
				metrix[i+1][j+1] = input;
//				System.out.print(" " +input);
			}
//			System.out.println();
		}
//		System.out.println(" = ");

		int[][] sectionSum = new int[suNo + 1][suNo + 1];
		for (int i = 1; i <= suNo; i++) {
			for (int j = 1; j <= suNo; j++) {
				sectionSum[i][j] = sectionSum[i][j-1] + sectionSum[i-1][j] - sectionSum[i-1][j-1] + metrix[i][j];
			}
		}

		for (int i = 0; i < quizNo; i++) {
			stringTokenizer = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(stringTokenizer.nextToken());//2
			int y1 = Integer.parseInt(stringTokenizer.nextToken());//2
			// print x1,y1 on metrix
			System.out.println("x1 = " + x1 + " y1 = " + y1 + " metrix[x1][y1] = " + metrix[x1][y1]);

			int x2 = Integer.parseInt(stringTokenizer.nextToken());//4
			int y2 = Integer.parseInt(stringTokenizer.nextToken());//3
			System.out.println("x2 = " + x2 + " y2 = " + y2 + " metrix[x2][y2] = " + metrix[x2][y2]);
			int result = 0;
//			result  = sectionSum[y2][x2] - sectionSum[y2][x1-1] - sectionSum[y1-1][x2] + sectionSum[x1-1][y1-1];
			result  = sectionSum[x2][y2] - sectionSum[x1-1][y2] - sectionSum[x2][y1-1] + sectionSum[x1-1][y1-1];

			System.out.println(result);

		}
	}
}
