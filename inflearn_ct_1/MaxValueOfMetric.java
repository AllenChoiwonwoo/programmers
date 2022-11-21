/**
 * create on 2022/11/03.
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

package inflearn_ct_1;

/**
 * create on 2022/11/03.
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
public class MaxValueOfMetric {

	public int solution(int n, int[][] arr){
		int maxValue = 0;
		for (int i = 0; i < n ; i++) {
			int rowSum = 0;
			int colSum = 0;
			for (int j = 0; j < n; j++) {
				rowSum += arr[i][j];
				colSum += arr[j][i];
			}
			maxValue = maxValue < rowSum ? rowSum : maxValue;
			maxValue = maxValue < colSum ? colSum : maxValue;
		}
		int diagonal = 0;
		int reversedDiagonal = 0;
		for (int i = 0; i < n; i++) {
			diagonal += arr[i][i];
			reversedDiagonal += arr[4-i][i];
		}

		maxValue = maxValue < diagonal ? diagonal : maxValue;
		maxValue = maxValue < reversedDiagonal ? reversedDiagonal : maxValue;
		return maxValue;

	}
	public static void main(String[] args) {
		MaxValueOfMetric m = new MaxValueOfMetric();
		int[][] arr = {{10, 13, 10, 12, 15}
				, {12, 39, 30, 23, 11}
				, {11, 25, 50, 53, 15}
				, {19, 27, 29, 37, 27}
				, {19, 13, 30, 13, 19}};
		System.out.println(m.solution(5, arr));

	}
}
