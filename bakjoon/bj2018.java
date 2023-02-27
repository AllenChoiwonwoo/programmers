/**
 * create on 2023/02/21.
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
import java.util.concurrent.ForkJoinPool;

/**
 * create on 2023/02/21.
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
public class bj2018 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		int target = Integer.parseInt(stringTokenizer.nextToken());
//		System.out.println("target = " + target);
		int[] numbs = new int[target+1];
		int start = 1;
		int end = 1;
		for (int i = 1; i < target+1 ; i++) {
			numbs[i] = i;
		}
		int answer =1;
		int sum = 1;
		int harfline = target/2;
		while (target != end ){
			if(sum == target){
				answer++;
				end++;
//				sum -= numbs[start];
//				start++;
				sum += end;
//				System.out.println("   =>    answer : "+answer);
			}else if(sum > target){
				sum -= start;
				start++;

			}else if (sum < target) {
				end++;
				sum += end;

			}
			if (start > harfline) break;
//			StringBuilder sb = new StringBuilder();
//			for (int i = 1; i < target+1; i++) {
//				if (i == start) sb.append("<<");
//				sb.append(numbs[i]);
//				if (i == end) sb.append(">>");
//				sb.append(" ");
//			}
//			System.out.println("!bj2018:71 = " + sb.toString() + "    =>    sum : "+sum);
//			sb.setLength(0);
		}
//		System.out.println("   =>    answer : "+answer);
		System.out.println(answer);

//		<script>
//			var adopVastMap = [
//				"https://pubads.g.doubleclick.net/gampad/ads?iu=/5932629,56555167/ca-video-pub-1474238860523410-tag/newsis_content_640x360-va-230221-1&description_url=https%3A%2F%2Fnewsis.com&tfcd=0&npa=0&sz=1x1%7C400x225%7C640x480%7C640x360%7C480x360%7C400x300&gdfp_req=1&output=vast&unviewed_position_start=1&env=vp&impl=s&correlator=&vad_type=linear&ad_rule=1&vid_d=1200",
//				"https://pubads.g.doubleclick.net/gampad/ads?iu=/5932629,56555167/ca-video-pub-1474238860523410-tag/newsis_content_640x360-va-230221-2&description_url=https%3A%2F%2Fnewsis.com&tfcd=0&npa=0&sz=1x1%7C400x225%7C640x480%7C640x360%7C480x360%7C400x300&gdfp_req=1&output=vast&unviewed_position_start=1&env=vp&impl=s&correlator=&vad_type=linear&ad_rule=1&vid_d=1200",
//				"https://pubads.g.doubleclick.net/gampad/ads?iu=/5932629,56555167/ca-video-pub-1474238860523410-tag/newsis_content_640x360-va-230221-3&description_url=https%3A%2F%2Fnewsis.com&tfcd=0&npa=0&sz=1x1%7C400x225%7C640x480%7C640x360%7C480x360%7C400x300&gdfp_req=1&output=vast&unviewed_position_start=1&env=vp&impl=s&correlator=&vad_type=linear&ad_rule=1&vid_d=1200",
//				"https://pubads.g.doubleclick.net/gampad/ads?iu=/5932629,56555167/ca-video-pub-1474238860523410-tag/newsis_content_640x360-va-230221-4&description_url=https%3A%2F%2Fnewsis.com&tfcd=0&npa=0&sz=1x1%7C400x225%7C640x480%7C640x360%7C480x360%7C400x300&gdfp_req=1&output=vast&unviewed_position_start=1&env=vp&impl=s&correlator=&vad_type=linear&ad_rule=1&vid_d=1200"
//		    ];
//		</script>

	}
}
