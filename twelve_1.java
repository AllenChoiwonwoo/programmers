/**
 * create on 2022/08/30.
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
 * create on 2022/08/30.
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
public class twelve_1 {
	public int solution(int n) {
		int val = 0;
		if (n % 2 == 0) {
			val = 3;
		} else {
			val = 2;
		}
		for (int i = 0; i < n; i++) {
			if (n % val == 1){
				break;
			}
			val+=2;
		}
		return val;
	}
	// 101 % 2 = 1
	//102 % 3 = 1

	// int n 보다 작은 소수 배열을 리턴하라
	public int[] getPrimeNumber(int n) {
		int[] primeNumber = new int[n];
		int cnt = 0;
		for (int i = 2; i < n; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				int test = cnt++;
				primeNumber[test] = i;
			}
		}
		return Arrays.copyOf(primeNumber, cnt);
	}

	public static void main(String[] args) {
		twelve_1 twelve_1 = new twelve_1();
		System.out.println("twelve_1.solution(10) = " + twelve_1.solution(12));
		int[] test = twelve_1.getPrimeNumber(100);
		//test 를 list 로 바꿔라
		System.out.println("Arrays.toString(test) = " + Arrays.toString(test));
		System.out.println(104 % 3);



//		System.out.println("twelve_1.getPrimeNumber(100) = " +  twelve_1.getPrimeNumber(100));
	}


}
