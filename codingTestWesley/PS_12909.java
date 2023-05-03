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

import java.util.Stack;

/**
 * create on 2023/05/03.
 * create by IntelliJ IDEA.
 *
 * <p> 코딩테스트 연습 스택/큐
 * 올바른 괄호 </p>
 * <p> {@https://school.programmers.co.kr/learn/courses/30/lessons/12909 } and {@link }관련 클래스 </p>
 *
 * @see
 * @version 1.0
 * @author allen
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
public class PS_12909 {
    public static boolean solution(String s){
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '('){
                stack.push(1);
            } else if (chars[i] == ')') {
                if (stack.size() > 0){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "(()())";
        boolean solution = solution(s);
        System.out.println("solution = " + solution);
    }
}
