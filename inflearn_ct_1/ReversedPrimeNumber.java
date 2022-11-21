/**
 * create on 2022/10/23.
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
 * create on 2022/10/23.
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
public class ReversedPrimeNumber {
	public int solution(int number){

		int revNumb = reverser(number);
		revNumb = checkPrime(revNumb) ? revNumb : 0;
		System.out.println("revNumb = " + revNumb);
		return 0;
	}
	public boolean checkPrime(int number){
		int sqrtNumb = (int) Math.sqrt(number);
		if (number <= 1){
			return false;
		}
		for (int i = 2; i <= sqrtNumb; i++) {
			if (number % i == 0){
				return false;
			}
		}
		return true;
	}
	public int reverser(int number){
		StringBuilder sb = new StringBuilder();
		sb.append(number);
		sb.reverse();
		System.out.println("reverse = " + sb.toString());
		return Integer.parseInt(sb.toString());
	}

	public static void main(String[] args) {
		ReversedPrimeNumber rpn = new ReversedPrimeNumber();
		System.out.println(rpn.solution(1));
	}
}
