/**
 * create on 2023/05/01.
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
 * create on 2023/05/01.
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
public class LC_58 {
    public static void main(String[] args) {
        String input = "   fly me   to   the moon  ";
        String[] words = input.split(" ");
        for (String word : words) {
            System.out.println("word = " + word);
        }
        int length = words.length;
        System.out.println(words[length-1]);
//        return words[length-1].length();

    }
}
