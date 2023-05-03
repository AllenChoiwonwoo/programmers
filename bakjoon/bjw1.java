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

package bakjoon;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

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
public class bjw1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int N = Integer.parseInt(br.readLine());
        int N = 14;
//        String BoardStr = br.readLine();
        String BoardStr = "inhauniversity";
//        int M = Integer.parseInt(br.readLine());
        int M = 5;
//        String S = br.readLine();
        String S = "igrus";
        char[] boardArr = BoardStr.toCharArray();
        char[] sentenceArr = S.toCharArray();
        int pointer = N - 1;
        int rotateCnt = 0;

        // 목표 문자열을 만들 수 있는지 없는지 확인
        // 없다 면 -1 출력
        Set<Character> boardSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            boardSet.add(boardArr[i]);
        }
        for (int i = 0; i < M; i++) {
            if (!boardSet.contains(sentenceArr[i])) {
                System.out.println(-1);
                return;
            }
        }

        /*
        char 1 개를 꺼낸다.
        pointer 번째의 char 과 같은지 확인
            같지 않으면
            같으면
                break;
            pointer ++; rotateCnt++;
         */
        for (int i = 0; i < sentenceArr.length; i++) {
            int tmpCnt = 0;
            while (true){
                pointer++;
                pointer = pointer % N;
                rotateCnt++;
                tmpCnt++;
                if (boardArr[pointer] == sentenceArr[i]){
                    System.out.println(sentenceArr[i] + " 까지 "+tmpCnt+" 번 회전");
                    break;
                }
            }
        }
        System.out.println("result  = " +rotateCnt);
        /*
        a : 1번회전
        a : 4번회전
        c : 2번회전
        d : 1번회전
        c : 3번회전
         */

//        for (int i = 0; i < sentenceArr.length; i++) {
//            char tmpChar = sentenceArr[i];
//
//            int distence1 = BoardStr.indexOf(tmpChar, pointer) + 1;
//            System.out.println("distence1 = " + distence1);
//            System.out.println("pointer = " + pointer);
//            int steps = 0;
//            if (distence1 > 0) {
//                steps = distence1 - pointer;
//                pointer = distence1;
//            }else{
//                steps += N - pointer;
//                pointer = 0;
//                int distence2 = BoardStr.indexOf(tmpChar, pointer)+1;
//                steps += distence2;
//                pointer = distence2;
//            }
//            System.out.println("To char : " +tmpChar);
//            System.out.println("steps = " + steps);
//        }
    }
}
