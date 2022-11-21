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
public class scoreCalculation {


	public int solution(String answer){
		int extraPoints = 0;
		int totalScore = 0;
		for (int i = 0; i < answer.length(); i++) {
//			System.out.println("answer.charAt(i) = " + answer.charAt(i));
//			System.out.println("extraPoints " +extraPoints);
			extraPoints = answer.charAt(i) == '1' ? extraPoints+1 : 0;
			System.out.println("extraPoints = " + extraPoints);
			totalScore += extraPoints;
//			System.out.println("totalScore = " + totalScore);
		}

		return totalScore;
	}

	public static void main(String[] args) {
		scoreCalculation sc = new scoreCalculation();
		System.out.println(sc.solution("1011100110"));
	}
}
