/**
 * create on 2022/11/21.
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

package inflearn_ct_1;

/**
 * create on 2022/11/21.
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
public class peak {

	public int solution(int length, int[][] arr){
//		checkPeek(arr, 3,1);
		int[][] resultPeekArr =  {{5, 3, 7, 2, 3}
						    	, {3, 7, 1, 6, 1}
						    	, {7, 2, 5, 3, 4}
								, {4, 3, 6, 4, 1}
								, {8, 7, 3, 5, 2}};
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				int result = checkPeek(arr, i, j);
				resultPeekArr[i][j] = result;
//				System.out.print(resultPeekArr[i][j]);
			}
//			System.out.println("");
		}

		System.out.println(" allen test ...");
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(resultPeekArr[i][j]+" ");
			}
			System.out.println("");
		}

		return 0;

	}
	public int checkPeek(int[][] arr, int _y ,int _x  ){ // 1, 3
		int[] verticalSide   = {-1,0,1,0};
		int[] horizentleSide = {0,1,0,-1};
		int _value = arr[_y][_x];
		System.out.println("_value = " + _value);
		// 북, 동, 남 , 서
//		int[] edgeHeights ={0,0,0,0};
		int edgeHeight = 0;
		for (int i = 0; i < 4; i++) {
			int checkingY = _y+verticalSide[i];
			System.out.println("checkingY = " + checkingY);
			int checkingX = _x+horizentleSide[i];
			System.out.println("checkingX = " + checkingX);
			if ( checkingY >= 0 && checkingY <= 4 && checkingX >= 0 && checkingX <= 4){
				edgeHeight = arr[checkingY][checkingX];
			}else {
				edgeHeight = -1;
			}
			System.out.println(" " + edgeHeight +" ");
			if (_value < edgeHeight){
				System.out.println("NO !peak = ---" +edgeHeight);
				return 0;
			}
			System.out.println(" = ");
		}
		System.out.println(" peak ---- "+_value);
		return 1;
	}

	public static void main(String[] args) {
		peak p = new peak();
		int length = 5;
		int[][] arr = {{5, 3, 7, 2, 3}
				     , {3, 7, 1, 6, 1}
					 , {7, 2, 5, 3, 4}
					 , {4, 3, 6, 4, 1}
					 , {8, 7, 3, 5, 2}};

		System.out.println(p.solution(length, arr));
	}

}
