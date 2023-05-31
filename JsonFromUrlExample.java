/**
 * create on 2023/03/08.
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

import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JsonFromUrlExample {
	public static void main(String[] args) {
		try {
			String ips = "13.13.133.133";
			String ip = ips.substring(0, ips.indexOf(","));
			System.out.println("ip = " + ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

