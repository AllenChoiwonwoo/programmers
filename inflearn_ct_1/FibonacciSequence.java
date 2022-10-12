/**
 * create on 2022/10/11.
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
 * create on 2022/10/11.
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
public class FibonacciSequence {

	public static void main(String[] args) {
		FibonacciSequence fs = new FibonacciSequence();
		System.out.println(fs.solution(10));
	}

	private String solution(int length) {
		int[] resultArr = new int[length];
		resultArr[0] = 1;
		resultArr[1] = 1;
		StringBuilder sb  = new StringBuilder();
		sb.append("1,1");
		for (int i = 2; i < length ; i++) {
			resultArr[i] = resultArr[i-2]+resultArr[i-1];
			sb.append(",").append(resultArr[i]);
		}

		return sb.toString();
	}
	private void recursion(int idx, int[] arr){
		if (arr.length == idx){
			return;
		}
		arr[idx] = arr[idx -2] + arr[idx -1];
	}
}
