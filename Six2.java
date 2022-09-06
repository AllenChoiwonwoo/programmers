/**
 * create on 2022/08/07.
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

import java.util.*;
import java.util.stream.Collectors;

/**
 * create on 2022/08/07.
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
public class Six2 {
	static int[] numbs ={1,2,4,6,7,9,11,15,20,13,17,23,37};
	static List<Integer> numbList = Arrays.stream(numbs).boxed().collect(Collectors.toList());

	static public Boolean isPrime(int num){
		int cnt = 0;
		for(int i = 1; i <= (int)Math.sqrt(num); i ++){
			if(num % i == 0) cnt += 1;
		}
		return cnt == 1;
	}

	public static void main(String[] args) {

		Set<Integer> ssSet = new HashSet<>();

		for (int i = 0; i < numbList.size(); i++) {
			for (int j = i+1; j < numbList.size(); j++) {
				for (int k = j+1; k < numbList.size(); k++) {
					int sum = numbList.get(i) + numbList.get(j) +numbList.get(k);
					ssSet.add(sum);
				}
			};

		}
		System.out.println("ssSet = " + ssSet);
		List<Integer> resultList = new ArrayList<>();
		for (Integer intVal : ssSet) {
//			if (intVal % 2 == 0){
//				continue;
//			}
//			boolean isSs = true;
//			for (int i = 3; i <= (int)Math.sqrt(intVal); i+=2) {
//				System.out.println("i = " + i);
//				if (intVal % i == 0){
//					isSs = false;
//					break;
//				}
//			}
//			if (isSs == true) resultList.add(intVal);

//			int cnt = 0;
//			for(int i = 1; i <= (int)Math.sqrt(intVal); i +=2){
//				if(intVal % i == 0) cnt += 1;
//			}
//			if (cnt == 1) resultList.add(intVal);
			if (isPrime(intVal)) resultList.add(intVal);

		}
		System.out.println("final resultList = " + resultList.toString());




//		for (int i = 0; i < numbList.size(); i++) {
//			List<Integer> eList1 = new ArrayList<>(numbList);
//			int peek1 = eList1.get(i);
//			eList1.remove(i);
////			System.out.println("eList1 = " + eList1.size());
//			for (int j = 0; j < eList1.size(); j++) {
//				List<Integer> eList2 = new ArrayList<>(numbList);
//				int peek2 = eList2.get(i);
//				eList2.remove(i);
//				for (int k = 0; k < eList2.size(); k++) {
//					List<Integer> eList3 = new ArrayList<>(numbList);
//					int peek3 = eList3.get(i);
//					int sum = peek1 + peek2 + peek3;
//					System.out.println("peek sum = " + sum);
////					eList3.remove(i);
//					System.out.println(String.format("peeks 1, 2, 3 =  %d , %d , %d  = sum : ", peek1, peek2, peek3));
//				}
//			}
//		}
	}
}
