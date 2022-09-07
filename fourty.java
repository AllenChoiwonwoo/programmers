import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * create on 2022/09/06.
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
public class fourty {
	/*
	1,0,1,1,1
	1,0,1,0,1
	1,0,1,1,1
	1,1,1,0,1
	0,0,0,0,1
	 */

	int maps[][] = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
	int as = 11;
	List<Integer> cntList = new ArrayList<Integer>();
	int w =0;
	int h =0;

	public int solution() {
		this.w = this.maps[0].length;
		this.h = this.maps.length;
		dfpMethed(maps, 0,0,0);

		// 0 이상의 cntList 의 최소값을 구하라
		// 0 이상의 값이 없다면 -1을 리턴하라
		int min = cntList.stream().filter(i -> i >= 0).min(Integer::compare).orElse(-1);


		return cntList.stream().max(Integer::compareTo).get();
	}

	public boolean checkValidDirection(int[][] maps, int idx, int tar){
		if (idx >= 0 && idx < w && tar >=0 && tar < w && maps[idx][tar] == 1){ // 멥안에 있는지 체크
			return true;
		}
		return false;
	}

	public void dfpMethed(int[][] maps, int idx, int tar, int val){

		// 탈출 : 가로 세로의 끝에 도달했을때

		// 어떻게 이동할 다음 블럭을 알지? -> 이동한곳은 0으로 변경
		// -> 그럼 다른 메서드가 돌때 안간곳이 0일수 있어?
		val++;
		int myMap[][] = new int[maps.length][maps[0].length];
		for(int i=0; i<maps.length; i++) {
			myMap[i] = maps[i].clone();
		}
		myMap[idx][tar] = 0;
//		for (int[] arr : myMap) {
//			List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//			System.out.println(" * * * " + list.toString());
//		}
//		System.out.println("-------- ------------ ---------- ");

		if (checkValidDirection(myMap, idx-1, tar)) {
//			System.out.println("north");
			dfpMethed(myMap, idx - 1, tar, val);//north
			}
		if (checkValidDirection(myMap, idx+1, tar)) {
//			System.out.println("south");
			dfpMethed(myMap, idx + 1, tar, val);//south}
		}
		if (checkValidDirection(myMap, idx, tar-1)) {
//			System.out.println("west");
			dfpMethed(myMap, idx, tar - 1, val);//west
		}
		if (checkValidDirection(myMap, idx, tar+1)) {
//			System.out.println("east");
			dfpMethed(myMap, idx, tar + 1, val);//east
		}

		// 길막힘
		if (tar+1 == w && idx+1 == h){
			cntList.add(val);
//			System.out.println("GOALLLLLL !!!!!!!!!~~~~~ "+val);
			return;
		}else{
			cntList.add(-1);
			return;
		}
	}

	public static void main(String[] args) {
		new fourty().solution();
//		int tmaps[][] = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
//		int t2maps[][] = new int[5][5];
//		for(int i=0; i<tmaps.length; i++) {
//			for(int j=0; j<tmaps[i].length; j++) {
//				t2maps[i][j] = tmaps[i][j];
//			}
//		}
//		t2maps[0][0] = 0;
//		t2maps[0][2] =0;
//		for (int[] arr : tmaps) {
//			List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//			System.out.println(" * * * " + list.toString());
//			break;
//		}



	}
}
