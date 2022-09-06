/**
 * create on 2022/08/30.
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

/**
 * create on 2022/08/30.
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
public class thirteen {

	public int solution(String dartResult) {
//		dartResult = "1S2D*3T";
		/*
		s
		d 재곱
		t 세제곱
		* 전 점수 *2
		# 해당점수 -
		 */

		int[] score = new int[3];
		int idx = -1;
		for (int j = 0; j < dartResult.length(); j++) {
			String oneStr = dartResult.substring(j, j + 1);
			if (oneStr.matches("[0-9]")) {
				idx++;
				if (dartResult.substring(j, j + 2).equals("10")) {
					score[idx] = 10;
					j++;
				} else {
					score[idx] = Integer.parseInt(oneStr);
				}
//				System.out.println(idx + "---------" + score[idx]);
				continue;
			}

//			char thisChar = dartResult.charAt(j);
//			System.out.println("thisChar = " + thisChar);
			switch (dartResult.charAt(j)) {
				case 'S':
//					System.out.println("*1");
					break;
				case 'D':
					score[idx] = score[idx] * score[idx];
//					System.out.println("n x n");
					break;
				case 'T':
					score[idx] = score[idx] * score[idx] * score[idx];
//					System.out.println("n x n x n");
					break;
				case '*':
					score[idx] *= 2;
					if (idx > 0) {
						score[idx - 1] *= 2;
					}
//					System.out.println("n x 2 , 전점수 * 2");
					break;
				case '#':
					score[idx] = score[idx] * -1;
//					System.out.println("n x -1");
					break;
			}
//				System.out.println(" = "+score[0]+"  "+score[1]+"  "+score[2]);
		}
		return score[0] + score[1] + score[2];
	}

	public static void main(String[] args) {
		String[] dartResult = {"1S2D*3T", "1D2S#10S", "1D2S0T", "1S*2T*3S", "1D#2S*3S", "1T2D3D#", "1D2S3T*"};
		thirteen thirteen = new thirteen();
		for (String value : dartResult) {
			System.out.println(thirteen.solution(value));
		}


	}
}
