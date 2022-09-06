/*
Created on 2022/08/31 9:09 PM In Intelli J IDEA
by jeon-wangi
description : 3개의 숫자로 조합할 수 있는 모든 경우의 수를 구하라
*/

import java.util.ArrayList;
import java.util.List;

public class Dfs {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int[] arr = {1, 3, 5};
		System.out.println(new Dfs().solution(arr));
	}

	public int solution(int[] arr) {
		List<String> list = new ArrayList<>();
		dfs(arr, 0, 0, list);
		System.out.println("list.toString() = " + list.toString());
		return list.size();
	}
///0,1,2
	public void dfs(int[] arr, int index, int target, List<String> list) {
		if (index == arr.length -1 && target > arr.length -1){
			return;
		}
		if (target > arr.length -1){
			dfs(arr, index +1, 0, list);
		}else{
			String val = sb.append(arr[index]).append(arr[target]).toString();
			list.add(val);
			sb.setLength(0);
			dfs(arr, index, target + 1, list);
		}

	}
}