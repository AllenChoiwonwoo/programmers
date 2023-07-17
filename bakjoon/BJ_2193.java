package bakjoon;

import java.util.Scanner;
public class BJ_2193 {

    private String solution(int N){
        if (N == 1) return "1";
        if (N == 2) return "1";
        long[] result = new long[N];
        long[] cntOne = new long[N];
        long[] cntZero = new long[N];
        cntOne[0] = 1;
        cntZero[1] = 1;
//        100 1or0
        for (int i = 2; i < N; i++) {
            if (cntOne[i-1] > 0){
                cntZero[i] += cntOne[i-1];  // 이전 자릿수에서 끝나는 수열 중에서 마지막 자리가 1인 수열의 개수를 현재 자릿수에서 끝나는 수열 중에서 마지막 자리가 0인 수열의 개수에 더해준다.
            }
            if (cntZero[i-1] > 0){
                cntZero[i] += cntZero[i-1];  // 이전 자릿수에서 끝나는 수열 중에서 마지막 자리가 0인 수열의 개수를 현재 자릿수에서 끝나는 수열 중에서 마지막 자리가 0인 수열의 개수에 더해준다.
                cntOne[i] += cntZero[i-1];   // 이전 자릿수에서 끝나는 수열 중에서 마지막 자리가 0인 수열의 개수를 현재 자릿수에서 끝나는 수열 중에서 마지막 자리가 1인 수열의 개수에 더해준다.
            }
            result[i] = cntOne[i] + cntZero[i];  // 현재 자릿수에서 끝나는 수열의 개수를 저장한다.
        }
        return String.valueOf(result[N-1]);  // N번째 자릿수에서 끝나는 수열의 개수를 반환한다.
    }
    public static void main(String[] args) {
        BJ_2193 bj_2193 = new BJ_2193();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(bj_2193.solution(N));

    }
}
