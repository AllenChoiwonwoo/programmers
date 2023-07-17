package programmers;

import java.util.Arrays;

public class PG_42862 {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] userSpare = new int[n+1];
        for (int i = 0; i < reserve.length; i++) {
            int tmpSpareUser = reserve[i];
            userSpare[tmpSpareUser] +=1;
        }
        for (int i = 0; i < lost.length; i++) {
            int tmpLostUser = lost[i];
            userSpare[tmpLostUser] -= 1;
        }
        for (int i = 1; i < userSpare.length; i++) {
//            System.out.println(i + " = " + userSpare[i]);
            int prev = i-1;
            int post = i+1;
            if (prev != 0 && userSpare[i] > 0 && userSpare[prev] < 0){ // 전값 확인
                userSpare[i]-=1;
                userSpare[prev]+=1;
            }
            if (post < userSpare.length && userSpare[i] > 0 && userSpare[post] < 0){ // 다음값 확인
                userSpare[i]-=1;
                userSpare[post]+=1;
            }
        }
        for (int i = 1; i < userSpare.length; i++) {
            if (userSpare[i] >= 0){
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        PG_42862 pg_42862 = new PG_42862();
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        System.out.println(pg_42862.solution(n, lost, reserve));

    }
}
