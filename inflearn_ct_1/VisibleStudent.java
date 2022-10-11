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
public class VisibleStudent {

	public int solution(int length, int[] arr ){
		int maxH = arr[0];
		int cnt = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxH){
				cnt++;
				maxH = arr[i];
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		VisibleStudent vs = new VisibleStudent();
		System.out.println(vs.solution(8, new int[]{130, 135, 148, 140, 145, 150, 150, 153}));
	}
}
