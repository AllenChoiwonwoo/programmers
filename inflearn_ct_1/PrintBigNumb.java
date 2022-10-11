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
public class PrintBigNumb {
	public String solution(int numb , int[] arr){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				sb.append(arr[i]);
				continue;
			}
			if (arr[i] > arr[i-1] ) sb.append(arr[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int[] test = {7,3,9,5,6,12};
		PrintBigNumb pbn = new PrintBigNumb();
		System.out.println(pbn.solution(6,test));
	}
}
