/**
 * create on 2023/05/15.
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
 * create on 2023/05/15.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@https://leetcode.com/problems/spiral-matrix-ii/ } and {@link }관련 클래스 </p>
 *
 * @see
 * @version 1.0
 * @author allen
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
public class LC_59 {
    static int[][] matirx;
    static int n = 0;
    public static int[][] generateMatrix(int n) {

        int[][] matirx = new int[n][n];
        int nn = n*n;
//                             E, S, W, N
        int[] xDir = new int[]{1, 0,-1, 0};
        int[] yDir = new int[]{0, 1 ,0,-1};
        int direction = 0; //  0  1  2  3

        int x = 0;
        int y = 0;
        for (int i = 1; i <= nn; i++) {
            // 현위치에 값 넣을 수 있는지 확인
            // 가능하면
            //  현위치xy 에 값 넣기
            // 불가능하
            //  반복문 종료
            if (matirx[y][x] == 0){
                matirx[y][x] = i;
            }else{
                break;
            }
            // 기존 방향으로 다음위치로 갈 수 있는지 확인
            // 있으면 x,y에 방향값 더하기
            // 없으면 다음 방향값으로 바꾸고 , x,y에 방향값 더하기
            int nextX = x + xDir[direction];
            int nextY = y + yDir[direction];
            if ((nextX < 0 || nextX >= n) || (nextY < 0 || nextY >= n)){
                direction = (direction + 1) % 4;
            }else if (matirx[nextY][nextX] > 0){
                direction = (direction + 1) % 4;
            }
            x = x + xDir[direction];
            y = y + yDir[direction];

        }

        return null;
    }
    /*
    1 2
    4 3

    1 2 3
    8 9 4
    7 6 5
     */


    public static void main(String[] args) {
        generateMatrix(4);
    }
}
