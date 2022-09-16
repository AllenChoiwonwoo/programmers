/**
 * create on 2022/09/15.
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

import java.sql.Array;

/**
 * create on 2022/09/15.
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
public class Recursive_1 {

	public int factorial(int i) {

		if (i > 0) {
			return i * factorial(i - 1);
		} else {
			return 1;
		}
	}

	public int gcd(int x, int y) {
		System.out.println("x = " + x + " y = " + y);
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}

	public int factorialWithLoop(int val){
		int result = 1;
		for (int i = val; i > 0; i--) {
			result *= i;
		}
		return result;
	}
	public int gcdWithLoop(int x, int y){
//		int result = 0;
		int nx = 0;
		while (y > 0){
			System.out.println("x = " + x + " y = " + y);
			nx = y;//6  2
			y = x%y;//2   6
			x = nx;//6 2
		}
		return nx;

	}

	// 14의 소인수분해한 값을 배열로 변환하라



	public int gcd(int[] intArr){
//		List<Integer> myList

		//2부터 쭉해보기?
		int divider = 2;
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i]%divider != 0){
				divider++;
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		Recursive_1 recursive_1 = new Recursive_1();
//		System.out.println(recursive_1.factorial(4));

//		System.out.println(recursive_1.gcd(8, 6));
//		System.out.println(recursive_1.factorialWithLoop(4));
		System.out.println(recursive_1.gcdWithLoop(8, 6));
				System.out.println(recursive_1.gcd(new int[]{20,16,8}));
//
	}
}
