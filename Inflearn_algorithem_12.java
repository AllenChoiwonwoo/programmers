/**
 * create on 2022/10/05.
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

import java.util.ArrayList;
import java.util.List;

/**
 * create on 2022/10/05.
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
public class Inflearn_algorithem_12 {

	public String solution(String input){
		StringBuilder sb = new StringBuilder();
		String decodedStr = input.replaceAll("[#]", "1");
		decodedStr = decodedStr.replaceAll("[*]", "0");
		for (int i = 0; i < decodedStr.length(); i+=7) {
			String oneBinaryCode = decodedStr.substring(i,i+7);
			sb.append((char) Integer.parseInt(oneBinaryCode, 2));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Inflearn_algorithem_12 inflearn_algorithem_12 = new Inflearn_algorithem_12();
		System.out.println(inflearn_algorithem_12.solution("#****###**#####**#####**##**"));
	}
}
