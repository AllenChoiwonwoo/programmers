/**
 * create on 2022/10/12.
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
 * create on 2022/10/12.
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
public class FindPrimeNumber {


	public static void main(String[] args) {
		FindPrimeNumber fpn = new FindPrimeNumber();
		System.out.println(fpn.solution(2));
	}

	private boolean solution(int val) {
		int[] primeArr = new int[val];

		// for문에서
		/*
		검증하고자 하는 수 n
		검증
			m = sqrt n
			m 길이의 배열 선언
			2~m 까지 반복하면서
				n % idx == 0 break
		 */

		int valSqrt = (int) Math.ceil(Math.sqrt(val));
		for (int j = 2; j <= valSqrt; j++) {
			System.out.println(j <= valSqrt);
			if (val % j == 0) {
				return false;
			}
		}
		return true;

//		StringBuilder sb = new StringBuilder();
//		for (int a : primeArr) {
//			sb.append(a).append(',');
//		}
//		System.out.println("sb.toString() = " + sb.toString());
//		return 0;
	}
}
