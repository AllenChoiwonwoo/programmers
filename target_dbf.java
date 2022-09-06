/**
 * create on 2022/09/02.
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

import javax.print.attribute.standard.PrinterResolution;

/**
 * create on 2022/09/02.
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
public class target_dbf {
	public static int cnt = 0;
	public static int thisTarget = 0;
	public int solution(int[] numbers , int target){
		thisTarget = target;
		dfsMethod(numbers, 0, 0);
		System.out.println("cnt = " + cnt);



		return 0;
	}

	public void dfsMethod(int[] numbers,int tar, int value){
		System.out.println("value = " + value);
		if (numbers.length-1 < tar){
			if (value == thisTarget) cnt++;
			return;
		}
		System.out.println(" , "+ tar +" , "+ value);
		int value1 = value + (numbers[tar]);
		int value2 = value + (numbers[tar] * -1);
		tar++;
		dfsMethod(numbers,  tar, value1);
		dfsMethod(numbers,  tar, value2);

	}

	public static void main(String[] args) {
		int[] numbers = {4, 1, 2, 1};
		int target = 4;

		System.out.println(new target_dbf().solution(numbers, target));
	}
}
