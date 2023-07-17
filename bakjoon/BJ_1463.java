package bakjoon;

public class BJ_1463 {
    /*
    정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

    X가 3으로 나누어 떨어지면, 3으로 나눈다.
    X가 2로 나누어 떨어지면, 2로 나눈다.
    1을 뺀다.
    정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

    10 : 9 3 1
    11 : 10 5 4 2 1
    11 : 10 9 3 1
    12 : 11 10 5 4 2 1
    12 : 11 10 9 3 1

    123 : 122 61  60  20 10 9  3 1
    123 : 122 121 120 40 20 10 9 3 1
    123 : 122 121 120 60 20 10 9 3 1

    140 : 139 138 69 23 1
     */
    int go(int N){
        int[] btArr = new int[N+1];
        solution(N, btArr, 0);
        return btArr[N];
    }
    void solution(int N, int[] btArr, int cntTmp){
        if (N == 1 ){
            if (btArr[N] > cntTmp){
                btArr[N] = cntTmp;
            }
            return;
        }
        if (N % 2 == 0){
            int tmpN = N/2;
            solution(tmpN, btArr, cntTmp+1);
        }
        if (N % 3 == 0){
            int tmpN = N/3;
            solution(tmpN, btArr, cntTmp+1);
        }
        if (N-1 == 1){
            int tmpN = N-1;
            solution(tmpN, btArr, cntTmp+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new BJ_1463().go(10));
    }
}
