/**
 * create on 2022/08/01.
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

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * create on 2022/08/01.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @see
 * @version 1.0
 * @author allen
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 * @name 없는 숫자 더하기
 * @url https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */
public class six {
	public static int result = 0;

	public int getOneNumb(List<Integer> numberList, int layer, int val){
		System.out.println("getOneNumb");
		for (int i = 0; i < numberList.size(); i++) {
			int peek = numberList.get(i);
			System.out.println(i+" peek " + peek + " , layer = "+ layer + " , val = "+val);
			numberList.remove(i);
			if (layer >= 3) {
//				if (true){// val 소수면  result ++
//
//				}else{ // 패스
//
//				}
				System.out.println("result  = " + (val + peek));
				return val + peek;

			}else{
//				System.out.println("else 문을 타는가?" );
				getOneNumb(numberList, ++layer, val+peek);
			}
//			return peek;
		}
		return 1;
	}
	public static void main(String[] args) {
		int[] numbs ={1,2,7,6,4};
		List<Integer> numbList = Arrays.stream(numbs).boxed().collect(Collectors.toList());
//		for (int i = 0; i < numbList.size(); i++) {
//			int peek = numbList.get(i);
//			numbList.remove(i);
//		}
		six mysix = new six();
		mysix.getOneNumb(numbList, 1, 0);
	}
}
