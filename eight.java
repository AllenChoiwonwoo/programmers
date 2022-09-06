/**
 * create on 2022/08/24.
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

import com.ibm.dtfj.image.j9.IFileLocationResolver;

import javax.xml.crypto.Data;
import java.util.*;
import java.util.stream.Collectors;

/**
 * create on 2022/08/24.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @author allen
 * @version 1.0
 * @see
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
public class eight {


	public static void main(String[] args) {


		class MyData {

			int idx;
			double percent;

			public MyData(int idx, double percent) {
				this.idx = idx;
				this.percent = percent;
			}

			private int getIdx() {
				return idx;
			}

			private double getPercent() {
				return percent;
			}


			@Override
			public String toString() {
				return "MyData{" +
						"idx=" + idx +
						", percent=" + percent +
						'}';
			}
		}

		int n = 2;
		int[] stages = {2,2,1,1,1,3};
		List<Integer> stageList = Arrays.stream(stages).boxed().collect(Collectors.toList());
		stageList.sort(Comparator.naturalOrder());
		int remainer = stageList.size();
		int failer = 0;
		List<String> persentList = new ArrayList<>();
		List<Double> persentDoubleList = new ArrayList<>();
		List<MyData> dataList = new ArrayList<>();


		for (int i = 1; i <= n; i++) {//4
			System.out.println("i = " + i);

			for (int j = 0; j < stageList.size() ; j++) {
				int step = stageList.get(j);

				if (step == i) {// 4: 4
					failer++;
					System.out.println("step = " + step);

				} else {
					System.out.println("failer = " + failer);
					persentList.add(failer + "/" + remainer);
					double value = failer / (double) remainer;
					dataList.add(new MyData(i, value));
					remainer -= failer;
					failer = 0;
//					stageList.removeAll(Collections.singleton(i));
					stageList = stageList.subList(j,stageList.size());
					break;

				}
				if (j == stageList.size()-1){
					System.out.println("failer = " + failer);
//					if (remainer <= 0) return;
					persentList.add(failer + "/" + remainer);
					double value = failer / (double) remainer;
					dataList.add(new MyData(i, value));
					remainer -= failer;
					failer = 0;
//					stageList.removeAll(Collections.singleton(i));
				}

			}

		}
		System.out.println("persentList = " + persentList);
		dataList.sort(((o1, o2) -> {
			if (o1.getPercent() > o2.getPercent())
				return -1;
			if (o1.getPercent() == o2.getPercent())
				return 1;
			return 1;
		}));
		dataList.forEach(System.out::println);
		int[] answer = new int[dataList.size()];
		for (int i = 0; i < dataList.size(); i++) {
			answer[i] = dataList.get(i).getIdx();
		}
//		return answer;
	}

}
