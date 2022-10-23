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
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
public class FindPrimeNumber {


	public static void main(String[] args) {
		FindPrimeNumber fpn = new FindPrimeNumber();
		System.out.println(fpn.solution(1000));
	}

	private int solution(int val) {
		int cnt = 0;
		int[] primeArr = new int[val+1];
		for (int i = 2; i < primeArr.length; i++) {
			if (primeArr[i] == 0){
				System.out.println("i = " + i);
				cnt++;
				for (int j = i; j < primeArr.length; j+=i) {
					primeArr[j] = 1;
//					System.out.println("j = " + j);
				}
			}
		}
		return cnt;
	}
}
