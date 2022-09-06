/**
 * create on 2022/08/24.
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

import java.util.Arrays;

/**
 * create on 2022/08/24.
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
public class LambdaTest {
	public static void main(String[] args) {
		Add test = (int[] a) -> {
			int sum = 0;
			for (int i : a) {
				sum += i;
			}
			return sum;
		};
		int[] test1 = {1,2,3};

		System.out.println(test.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

	}
}

interface Add {
	int add(int... a);
}
