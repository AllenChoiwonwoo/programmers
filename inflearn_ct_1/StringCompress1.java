package inflearn_ct_1; /**
 * create on 2022/09/23.
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

/**
 * create on 2022/09/23.
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
public class StringCompress1 {

	public static void main(String[] args) {
		StringCompress1 stringCompress1 = new StringCompress1();
		System.out.println(stringCompress1.solution("aabbaccc"));
		System.out.println(stringCompress1.solution("KKHSSSSSSSE"));
		System.out.println(stringCompress1.solution("abcabcdede"));
		System.out.println(stringCompress1.solution("abcabcabcabcdededededede"));
		System.out.println(stringCompress1.solution("xababcdcdababcdcd"));
	}

	public String solution(String s) {
		char[] test = (s+'1').toCharArray();

		StringBuilder sb = new StringBuilder();
//		char chari = '1';
		int cnt = 1;

		for (int i = 0; i < test.length-1 ; i++) {
			if (test[i] != test[i+1]){
				sb.append(test[i]);
				if (cnt > 1) {
					sb.append(cnt);
					cnt = 1;
				}
			}else{
				cnt++;
			}

//
//			if (test[i] != chari){
//				if (cnt > 1){
//					sb.append(cnt);
//				}
//				cnt = 1;
//				chari = test[i];
//				sb.append(test[i]);
//			}else if(test[i] == chari){
//				cnt++;
//
//			}
		}
//		if (cnt > 1){
//			sb.append(cnt);
//		}

		return sb.toString();
	}


}
