/**
 * create on 2022/09/20.
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

public class ExtractIntager {

	public int extract(String str){
		return Integer.parseInt(str.replaceAll("[^0-9]",""));
	}
	public int extract2(String str){
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))){
				sb.append(str.charAt(i));
			}
		}
		return Integer.parseInt(sb.toString());
	}
	public String getDistenseOfString(String str, String s){
		int recur = 0;
		StringBuilder sb = new StringBuilder();

		for (int i=0; i < str.length(); i++) {
			String oneS = str.substring(i,i+1);
			int first = str.indexOf(s,recur+1);
			int second = str.indexOf(s, first+recur+1);
			System.out.println("!ExtractIntager:31 = " +first +" , "+second +" : t idx = "+oneS+":"+i + " recur = "+recur);
			if (Math.abs(i-first) < Math.abs(i-second)){
				sb.append(Math.abs(i-first));
			}else{
				sb.append(Math.abs(i-second));
			}
//			System.out.println("i = " + i);
//			System.out.println("first = " + first);
			if(i == second) {
				recur = first;
			}
//			System.out.println("recur = " + recur);
		}
		return sb.toString();
	}


	public static void main(String[] args) {
		ExtractIntager extractIntager = new ExtractIntager();
//		System.out.println(extractIntager.extract2("glen2TOs&eSo1f2t"));
		System.out.println("extractIntager = " + extractIntager.getDistenseOfString("teachermode","e"));
	}
}
