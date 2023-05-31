/**
 * create on 2023/05/14.
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * create on 2023/05/14.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @see
 * @version 1.0
 * @author allen
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 * 이중우선순위큐
 */
public class PS_42628 {

    public static int[] solution(String[] operations){
        List<Integer> list = new ArrayList();

        for (int i = 0; i < operations.length; i++) {
            char command = operations[i].charAt(0);
            int data = Integer.parseInt(operations[i].substring(2));
            if (command == 'I') {
                System.out.println("Insert data = " + data);
                list.add(data);
            }
            if (command == 'D' && data == 1 && list.size() > 0) { // 최대값 삭제
                Integer maxVal = Collections.max(list);
                System.out.println("Delete maxVal = " + maxVal);
                list.remove(maxVal);
            }else if (command == 'D' && data == -1 && list.size() > 0) { // 최소값 삭제
                Integer minVal = Collections.min(list);
                System.out.println("Delete minVal = " + minVal);
                list.remove(minVal);
            }

        }
        int[] result = new int[2];
        if (list.size() == 0) {
            return result;
        }else {
            result[0] = Collections.max(list);
            result[1] = Collections.min(list);
            return result;
        }


    }
    public static void main(String[] args) {
//        String[] test = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
//        String[] test = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        String[] test = {"I 16", "I 16", "D -1", "I 27"};

        int[] solution = solution(test);
        for (int i = 0; i <solution.length ; i++) {
            System.out.println("solution[i] = " + solution[i]);
        }

    }

}
