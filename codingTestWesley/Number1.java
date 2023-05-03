/**
 * create on 2022/12/12.
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

package codingTestWesley;

/**
 * create on 2022/12/12.
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
public class Number1 {
	// 22 + 9 의 나머지는 (0)입니다.


	public int solution(int n, int k) {
		int answer = 1;
		float value = Float.valueOf(n);
		String strValue = String.valueOf(n);
		String valueStack = "";
		// value 를 문자로 바꿔라

		while (1000000000 > value){
			System.out.println("!Number1:36 = " +valueStack);
//			answer++;

			valueStack += strValue.toString();
			try {
				value = Float.valueOf(valueStack);
			}catch (Exception e){
				System.out.println("!Number1:43 = " +e);
				return -1;
			}
//			if (value % k == 0.0){
//				return answer;
//			}

			answer++;

		}
		return -1;
	}
	// 인풋 값이 n 의 배수인지 판별하는 메서드
	public boolean isMultiple(int n, int k){
		return n % k == 0;
	}
	public long remainder(String str, int mod) {
		int ret = 0;
//		for (int i = 0; i < str.length(); i++) {
//			ret = (ret * 10 + (int)str[i] - '0') % mod;
//		}
		return ret;
	}

	public static void main(String[] args) {
		Number1 n1 = new Number1();
		System.out.println(n1.solution(22, 9));
	}
}
