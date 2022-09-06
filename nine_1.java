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
 * 직사각형 *
 */
public class nine_1 {

	// 두개의 숫자를가진 이차원 배열이 주어질때
	// 두개의 숫자중 큰수와 작은수를 구하고
	// 큰수의 최대값과 작은수의 최대값을 구하고
	// 두개의 최대값을 곱한값을 리턴하라
	public static void main(String[] args) {
		int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		int hmax = 0;
		int wmax = 0;

		for (int[] ints : sizes) {
			int max1 = ints[0];
			int min1 = ints[1];
			if (ints[0] < ints[1]) {
				max1 = ints[1];
				min1 = ints[0];
			}

			if (hmax < max1) {
				hmax = max1;
			}
			if (wmax < min1) {
				wmax = min1;
			}
			System.out.println("hmax = " + hmax);
			System.out.println("wmax = " + wmax);

		}
		System.out.println(hmax * wmax);
	}

}
