/**
 * create on 2023/05/31.
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

package bakjoon;

import com.sun.tools.javac.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * create on 2023/05/31.
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
public class BJ_1715 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;
        N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> cardsQueue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            cardsQueue.add(Integer.parseInt(br.readLine()));
        }
        int totalSum = 0;
        while (cardsQueue.size() > 1){
//            System.out.println("cardsQueue.poll() = " + cardsQueue.poll());
            int tmpSum = cardsQueue.poll() + cardsQueue.poll();
            totalSum += tmpSum;
            cardsQueue.add(tmpSum);
        }
        System.out.println(totalSum);
    }
}
