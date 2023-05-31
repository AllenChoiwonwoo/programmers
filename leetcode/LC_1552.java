/**
 * create on 2023/05/21.
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

package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * create on 2023/05/21.
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
public class LC_1552 {
    public static void main(String[] args) {
        int[] position = {1,2,3,4,7};
        int m = 3;
        System.out.println(maxValue(position, m));

    }

    private static int maxValue(int[] position, int m) {
        int[] largeSet = new int[2];
        int maxDistence = 0;
        Arrays.sort(position);


        for (int i = 0; i < position.length-1; i++) {
            if (maxDistence < position[i+1] - position[i]) {
                maxDistence = position[i+1] - position[i];
            }
//            if (maxDistence > position[position.length-1] - position[i+1]){
//                break;
//            }
        }

        return maxDistence;
    }
}
