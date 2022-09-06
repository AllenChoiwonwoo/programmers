/**
 * create on 2022/07/31.
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

import java.util.Arrays;
import java.util.Stack;

/**
 * create on 2022/07/31.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @see
 * @version 1.0
 * @author allen
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 * @name 크레인 인형뽑기 게임
 * @url https://school.programmers.co.kr/learn/courses/30/lessons/64061
 */
public class five {

	int[][] board1 = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
	// {0,0,0,4,3}
	int[][] colBoard1 = new int[5][5];
	Stack<Integer> stack = new Stack();
	int result = 0;

	public int getSol(int[][] colBoard, int[] moves) {
		for (int move: moves) {
			System.out.println("move = " + move);
			move--;
			for (int j = 0; j < colBoard.length; j++) {
				if (colBoard[j][move] > 0){
					if (stack.size() > 0 && stack.peek() == colBoard[j][move]){
						stack.pop();
						result++;
					}else{
						stack.push(colBoard[j][move]);
					}
					colBoard[j][move] = 0;
					for (int[] ints: colBoard) {
//						System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
					}
//					System.out.println("stack.toString() = " + stack.toString());
					break;
				}

			}
		}
//		System.out.println("stack.toString() = " + stack.toString());
		return result;
	}


	public static void main(String[] args) {
		five _five = new five();
//		int[][] myColBoard = _five.getColBoard();
		int[] moves = {1,5,3,5,1,2,1,4};
		int rr = _five.getSol(_five.board1, moves);
		System.out.println("rr = " + rr*2);
	}
}
