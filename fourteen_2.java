/**
 * create on 2022/09/13.
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

import java.util.LinkedList;
import java.util.Queue;

/**
 * create on 2022/09/13.
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
public class fourteen_2 {
	int maps[][] = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
	int[] dx = {-1, 1, 0, 0};
	int[] dy = {0, 0, -1, 1};

	public int bfs(int x,int y){
		Queue queue = new LinkedList<int[]>();
		queue.add(new int[]{x,y});
		while (!queue.isEmpty()){
			int[] poll = (int[]) queue.poll();
			for (int i = 0; i<4; i++){
				int nx = poll[0] + dx[i];
				int ny = poll[1] + dy[i];
				if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length && maps[nx][ny] == 1){
					maps[nx][ny] = maps[poll[0]][poll[1]] + 1;
					queue.add(new int[]{nx,ny});
				}
			}
		}
		return maps[maps.length-1][maps[0].length-1];
	}

	public static void main(String[] args) {
		fourteen_2 fourteen_2 = new fourteen_2();
		System.out.println(fourteen_2.bfs(0,0));
	}


}
