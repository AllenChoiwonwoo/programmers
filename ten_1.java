/**
 * create on 2022/08/29.
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

import java.util.HashSet;
import java.util.Set;

/**
 * create on 2022/08/29.
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
public class ten_1 {

	// 숫자 배열이 주어질때
	// 모든 원소를 set에 담고
	// set의 크기를 리턴하라
	// 만약 set의 크기가 숫자배열의 크기보다 크다면
	// 숫자배열의 길이 나누기 2 를 리턴하라
	// 그렇지 않다면 set의 크기를 리턴하라
	public static int solution(int[] A) {
		Set<Integer> set = new HashSet<>();
		for (int i : A) {
			set.add(i);
		}
		if (set.size() > A.length / 2) {
			return A.length / 2;
		} else {
			return set.size();
		}
	}




}
