/**
 * create on 2022/11/03.
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

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * create on 2022/11/03.
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
public class Rangking {

	public int solution(int length, int[] arr){
		int[] answer = new int[length];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <length ; i++) {
			int rank = 1;
			for (int j = 0; j < length; j++) {
				if(arr[i] < arr[j]){
					rank++;
				}
			}
			answer[i] = rank;
			sb.append(" ").append(rank);

		}
		System.out.println(sb.toString());
		return 1;
	}

	public static void main(String[] args) {
		Rangking r = new Rangking();
		System.out.println(r.solution(5, new int[]{87, 89, 92, 100, 76}));
	}
}
