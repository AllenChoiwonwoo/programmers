/**
 * create on 2022/08/27.
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

import java.time.LocalDateTime;
import java.util.*;

/**
 * create on 2022/08/27.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @author allen
 * @version 1.0
 * @url =: https://school.programmers.co.kr/learn/courses/30/lessons/42889
 * @see
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
public class eight_2 {


	public static void main(String[] args) {

		/*
		comparable 에 대한 학습필요

		stage 별 실패자 cnt 할때
		map -> array 로 바꿨더니 성능이 약 3배 좋아졌다.

		 */
		class MyData implements Comparable<MyData> {
			int idx;
			double percent;
			String rate;

			public MyData(int idx, double percent, String rate) {
				this.idx = idx;
				this.percent = percent;
				this.rate = rate;
			}

			public int getIdx() {
				return idx;
			}

			public double getPercent() {
				return percent;
			}
			public String getRate() {
				return rate;
			}

			int calculateDaysBetweenDates(Date sdate, Date edate){
				long diff = edate.getTime() - sdate.getTime();
				return (int) (diff / (24 * 60 * 60 * 1000));
			}

			List<Integer> sortListDesc(List<Integer> list) {
				Collections.sort(list, Collections.reverseOrder());
				return list;
			}

			//sort list
			//and percent desc
			//and idx asc
			public List<MyData> sortList(List<MyData> list) {
				Collections.sort(list, new Comparator<MyData>() {
					@Override
					public int compare(MyData o1, MyData o2) {
						if (o1.getPercent() > o2.getPercent()) {
							return -1;
						} else if (o1.getPercent() < o2.getPercent()) {
							return 1;
						} else {
							if (o1.getIdx() < o2.getIdx()) {
								return -1;
							} else if (o1.getIdx() > o2.getIdx()) {
								return 1;
							} else {
								return 0;
							}
						}
					}
				});
				return list;
			}






			@Override
			public String toString() {
				return "MyData{" +
						"idx=" + idx +
						", percent=" + percent +
						", rate=" + rate +
						'}';
			}

			@Override
			public int compareTo(MyData o) {
				if(percent > o.getPercent()){
					return -1;
				}
				if (percent < o.getPercent()){
					return 1;
				}
				return 0;
			}
		}

		int n = 4;
		int[] stages = {4,4,4,4};

		int[] failerArr = new int[n+2];
		for (int stage: stages) {
			failerArr[stage] += 1;
		}
//		Map<Integer, Integer> failerMap = new HashMap<>();
//		for (Integer stage : stages) {
//			failerMap.put(stage, failerMap.getOrDefault(stage, 0) + 1);
//		}
		System.out.println("failerArr = " + failerArr);
//		for (Integer key : failerMap.keySet()){
//			System.out.println("key = " + key);
//		}
		List<MyData> dataList = new LinkedList<>();
		int leftCnt = stages.length;
		for (int i = 1; i <= n; i++) {
//			int failerOfStage = failerMap.getOrDefault(i, 0);
			int failerOfStage = failerArr[i];
			double failRate = failerOfStage / (double) leftCnt;
			dataList.add(new MyData(i, failRate, failerOfStage + "/"+leftCnt));
			leftCnt -= failerOfStage;
		}

		Collections.sort(dataList);

		dataList.forEach(System.out::println);
		int[] answer = new int[n];
		for(int i=0;i<dataList.size();i++) {
			answer[i] = dataList.get(i).getIdx();
			System.out.println("dataList.get(i).getIdx() = " + dataList.get(i).getIdx());
		}

		
	

	}


}
