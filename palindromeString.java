/**
 * create on 2022/09/20.
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

import java.util.Locale;

/**
 * create on 2022/09/20.
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
public class palindromeString {
	public boolean isPalindromString(String str){
		str = str.toLowerCase(Locale.ROOT);
		boolean result = false;
		for (int i = 0; i < str.length()/2; i++) {
			System.out.println("!palindromeString:33 = " +str.substring(i,i+1));
			System.out.println("!palindromeString:34 = " +str.substring(str.length()-i-1,str.length()-i));
			System.out.println();

			if (str.substring(i,i+1).equals(str.substring(str.length()-i-1,str.length()-i))){
				result = true;
			}
		}
		return result;
	}

	public boolean isPalindromString2(String str){
		str = str.toLowerCase(Locale.ROOT);
		char[] charStr = str.toCharArray();
		boolean result = true;
		for (int i = 0; i < str.length()/2; i++) {
			System.out.println("!palindromeString:33 = " +charStr[i]);
			System.out.println("!palindromeString:34 = " +charStr[str.length()-i-1]);
			System.out.println();

			if (charStr[i] != charStr[str.length()-i-1]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		palindromeString palindromeString = new palindromeString();
		System.out.println(palindromeString.isPalindromString2("aooG"));
	}
}
