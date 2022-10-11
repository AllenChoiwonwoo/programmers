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

import java.awt.*;

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
public class RockPaperScissors {

	public static void main(String[] args) {
		RockPaperScissors rps = new RockPaperScissors();
		System.out.println(rps.solution(5, new int[]{2, 3, 3, 1, 3}, new int[]{1, 1, 2, 2, 3}));
	}

	private String solution(int i, int[] aint, int[] bint) {
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < i; j++) {
			System.out.printf("aint, aint = %d , %d %n", aint[j], bint[j]);
//			System.out.println(aint[j] > bint[j] ? "A" : aint[j] < bint[j] ? "B" : "D");
			if (aint[j] == bint[j]){
				System.out.println("!RockPaperScissors:42 = D");
				sb.append("D");
			}else if(aint[j] == 3 && bint[j] == 1){
				sb.append("B");
			}else if(aint[j] == 1 && bint[j] == 2){
				sb.append("B");
			}else if(aint[j] == 2 && bint[j] == 3){
				sb.append("B");
			}else{
				sb.append("A");
			}
		}
		return sb.toString();
	}
}
