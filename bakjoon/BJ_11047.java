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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
public class BJ_11047 {
    public static void main(String[] args) throws IOException {
        int N;
        int K;
        int[] coin;
        int cnt = 0;
        int restK;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        restK = K;
        coin = new int[N];
        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        // 큰 동전 부터 확인
        /*
        k 보다 크면 pass
        k 보다 작으면
            k 를 동전으로 나눈 몫을 cnt 에 더한다.
            k 를 동전으로 나눈 나머지를 restK 에 담는다.
         */

        for (int i = N-1; i >= 0; i--) {
            if (coin[i] > restK){
                continue;
            }else{
                int share =  restK / coin[i];
                cnt += share;
                restK = K % coin[i];
            }
            if (restK == 0) break;
        }
        System.out.println(cnt);
    }
}
