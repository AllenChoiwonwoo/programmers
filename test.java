/**
 * create on 2022/08/27.
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
 * create on 2022/08/27.
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
public class test {
	public static void main(String[] args) {
		String a = "allentest";
		String b = new String("allentest");

		System.out.println("a == b = " + (a == b));
		System.out.println("(a == b.intern()) = " + (a == b.intern()));
	}
	
}
