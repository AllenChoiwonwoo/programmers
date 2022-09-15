/**
 * create on 2022/09/14.
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

/**
 * create on 2022/09/14.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @see
 * @version 1.0
 * @author allen
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 *
 * 1, 1, 0
 * 1, 1, 1
 * 0, 1, 1
 *
 * 1, 0, 0, 1
 * 0, 1, 1, 0
 * 0, 1, 1, 1
 * 1, 0, 1, 1
 */
public class sixteen_1 {

	int[][] computers;

	public int solution(int n, int[][] computers) {
		int netCnt = 0;
		int x = n;
		int y = n;
		for (int i = 0; i < y; i++) {
//			System.out.println("y "+y);
			for (int j = i+1; j < x; j++) {
//				System.out.println("x =" + x + ", y = "+ j);
//				if (j == 1) netCnt++;
				if (computers[i][j] == 0){ // 연결 안됌
					netCnt++;
				}else if(computers[i][j] > 1){ // 이미 연결됨

				}else if(computers[i][j] == 1){ // 연결됨 , 안갔음

				}
			}

		}
//
//		return netCnt;


		return 0;
	}



	public void netDfs(int n, int[][] computers, int nextNode ,int x){
		if (nextNode >= 0 && nextNode < n && x >= 0 && x < n){

		}
		for (int i = 0; i < n; i++) {

		}
		if (computers[nextNode][x] == 0){
			netDfs(n, computers, nextNode, x++);
		}


		if(n == nextNode && n == x){
			return;
		}



	}
	public int checkNet(int x, int y){

		if (computers[x][y] == 1){
			// 연결
			return 1;
		}else{
			// 연결 x
			return 0;
		}
	}


	public static void main(String[] args) {
		sixteen_1 sixteen_1 = new sixteen_1();
		int[][] computers1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		System.out.println(sixteen_1.solution(3, computers1));
		int[][] computers2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
		System.out.println(sixteen_1.solution(3, computers2));

	}
}
