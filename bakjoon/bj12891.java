/**
 * create on 2023/03/08.
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
import java.util.StringTokenizer;

public class bj12891 {
	static int checkArr[];
	static int myArr[];
	static int checkSecret;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int S = Integer.parseInt(st.nextToken()); // DNA 문자열의 길이
		int P = Integer.parseInt(st.nextToken()); // DNA 부분 문자열의 길이
		int Result = 0;
		char A[] = new char[S];
		checkArr = new int[4];
		myArr = new int[4];
		checkSecret = 0;
		A = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) {
				checkSecret++;
			}
		}
		for (int i = 0; i < P; i++) {
			add(A[i]);
		}
		if (checkSecret == 4) {
			Result++;
		}
//		System.out.println("result = " + result);

		for (int i = P; i < S; i++) {
			int j = i - P;
			add(A[i]);
			remove(A[j]);
			if (checkSecret == 4) {
				Result++;
			}
		}
		System.out.println(Result);
		bf.close();
	}

	public static void add(char c){
		switch (c) {
			case 'A':
				myArr[0]++;
				if (checkArr[0] == myArr[0]) {
					checkSecret++;
				}
				break;
			case 'C':
				myArr[1]++;
				if (checkArr[1] == myArr[1]) {
					checkSecret++;
				}
				break;
			case 'G':
				myArr[2]++;
				if (checkArr[2] == myArr[2]) {
					checkSecret++;
				}
				break;
			case 'T':
				myArr[3]++;
				if (checkArr[3] == myArr[3]) {
					checkSecret++;
				}
				break;
		}
	}
	public static void remove(char c){
		switch (c) {
			case 'A':
				if (checkArr[0] == myArr[0]) {
					checkSecret--;
				}
				myArr[0]--;
				break;
			case 'C':
				if (checkArr[1] == myArr[1]) {
					checkSecret--;
				}
				myArr[1]--;
				break;
			case 'G':
				if (checkArr[2] == myArr[2]) {
					checkSecret--;
				}
				myArr[2]--;
				break;
			case 'T':
				if (checkArr[3] == myArr[3]) {
					checkSecret--;
				}
				myArr[3]--;
				break;
		}
	}
}
