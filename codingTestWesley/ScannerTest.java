/**
 * create on 2022/12/14.
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

import java.util.Scanner;

/**
 * create on 2022/12/14.
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
public class ScannerTest {
	public void scantoo() {
		
	}
	public static void close(Scanner sc){
		sc.close();
	}
	public static void main(String[] args) {
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		while (cnt < 4){
			String val = scan.nextLine();
			System.out.println("val = " + val);
			close(scan);
			String val2 = scan2.nextLine();
			System.out.println("val2 = " + val2);
			cnt++;
			
		}
		
	}
}
