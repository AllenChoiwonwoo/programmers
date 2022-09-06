/**
 * create on 2022/07/21.
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * create on 2022/07/21.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @see
 * @version 1.0
 * @author allen
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 * @url https://school.programmers.co.kr/learn/courses/30/lessons/77484
 * @title 로또의 최고 순위와 최저 순위
 */
public class Second {
	static int[] LOTTOS = {21,22,23,24,25,26};
	static int[] WIN_NUMBERS = {20, 9, 3, 45, 4, 35};
	public static void main(String[] args) {
		int[] answer = new int[2];
		List<Integer> lottos = IntStream.of(LOTTOS).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		List<Integer> winNumbs = IntStream.of(WIN_NUMBERS).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("lottos = " + lottos);
		System.out.println("winNumbs = " + winNumbs);
		List<Integer> zeroList = lottos.stream().filter(i -> i == 0).collect(Collectors.toList());
		System.out.println("zeroList.size() = " + zeroList.size());
		int numCnt = 6 - zeroList.size();
		System.out.println("numCnt = " + numCnt);
		int sameCnt = 0;
		for (int i = 0; i < numCnt; i++) {
			if (winNumbs.contains(lottos.get(i))) {
				sameCnt++;
			}
		}
		System.out.println("same = "+sameCnt);
		int minRank = 7 - sameCnt; //0
		int maxRank = minRank - zeroList.size();
		answer[0] = maxRank >= 6 ? 6 : maxRank;
		answer[1] = minRank >= 6 ? 6 : minRank;
		System.out.println("maxRank = " + answer[0] + ", minRank = "+ answer[1]);
		/*
		lottos 정렬


		숫자비교 해 보이는 개수 cnt, 불일치 개수 cnt, 안보이는 개수 cnt

		보이는 개수 cnt 로 등수 확인, 최저 등수 확인

		최저등수 - 안보이는 개수 = 최고등수




		 */


	}
}
