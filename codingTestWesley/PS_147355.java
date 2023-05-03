/**
 * create on 2023/05/03.
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
 * create on 2023/05/03.
 * create by IntelliJ IDEA.
 *
 * <p> 크기가 작은 부분문자열 </p>
 * <p> {@https://school.programmers.co.kr/learn/courses/30/lessons/147355 } and {@link }관련 클래스 </p>
 *
 * @see
 * @version 1.0
 * @author allen
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
public class PS_147355 {
    public static void main(String[] args) {
        String t = "500220839878789";
        String p = "5002208398";
        long intP = Long.parseLong(p);
        int len = p.length();
        int cnt = 0;
        
        for (int i = 0; i <= t.length()-len; i++) {
            String valueStr = t.substring(i, i+len);
            if (Long.parseLong(valueStr) <= intP){
                cnt++;
            }
        }
        System.out.println("cnt = " + cnt);
    }
}
