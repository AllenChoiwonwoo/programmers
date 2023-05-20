package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1018 {

    char[][] BoardWithWhiteStart;
    char[][] BoardWithBlackStart;
    int widthLoop;
    int heightLoop;
    int[] whitePrefixSum;
    int[] blackPrefixSum;

    int minCnt = Integer.MAX_VALUE;
    char[][] inputStrArr;

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer dimensions = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(dimensions.nextToken());
        int width = Integer.parseInt(dimensions.nextToken());
        String ref = "WBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBW";
        BoardWithWhiteStart = new char[height][width];
        BoardWithBlackStart = new char[height][width];

        inputStrArr = new char[height][width];
        for (int i = 0; i < height; i++) {
            inputStrArr[i] = br.readLine().toCharArray();

            if ((i+1) % 2 == 1){
                BoardWithWhiteStart[i] = ref.substring(0,width).toCharArray();
                BoardWithBlackStart[i] = ref.substring(1,width+1).toCharArray();
            }else{
                BoardWithWhiteStart[i] = ref.substring(1,width+1).toCharArray();
                BoardWithBlackStart[i] = ref.substring(0,width).toCharArray();
            }
        }
        int[][] DiffBoardWhite = new int[height][width];
        int[][] DiffBoardBlack = new int[height][width];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                DiffBoardWhite[y][x] = BoardWithWhiteStart[y][x] == inputStrArr[y][x] ? 0 : 1;
                DiffBoardBlack[y][x] = BoardWithBlackStart[y][x] == inputStrArr[y][x] ? 0 : 1;
            }
        }


//        int loopLimit = (width - 7) * (height - 7);
        widthLoop = width-7;
        heightLoop = height-7;
        System.out.println("widthLoop = " + widthLoop+ ", heightLoop = " + heightLoop);

        whitePrefixSum = new int[widthLoop];
        blackPrefixSum = new int[widthLoop];



        for (int yn = 0; yn < heightLoop; yn++) {
            for (int xn = 0; xn < widthLoop; xn++) {
                int addY = 0;
                if (xn == 0){ // 초기 셋팅
                    setFirstBoard();
                    addY++;
                }else{ // 제거된 값만크만 빼고 ,추가된 부분 만큰만 더한다
                    whitePrefixSum[xn] =whitePrefixSum[xn -1];
                    blackPrefixSum[xn] =blackPrefixSum[xn -1];
                    while (addY <= 7){
                        int yc = yn + addY;
                        int xAdd = xn+7;
                        int xSub = xn-1;
                        whitePrefixSum[xn] += DiffBoardWhite[yc][xAdd] - DiffBoardWhite[yc][xSub];
                        blackPrefixSum[xn] += DiffBoardBlack[yn][xAdd] - DiffBoardBlack[yc][xSub];
                        addY++;
                    }
                    System.out.println("white = %d, black = %d".formatted(whitePrefixSum[xn], blackPrefixSum[xn]));
                    minCnt = whitePrefixSum[xn] > minCnt ? minCnt : whitePrefixSum[xn];
                    minCnt = blackPrefixSum[xn] > minCnt ? minCnt : blackPrefixSum[xn];
                }
            }

            //whitePrefixSum 중 최소값 찾기

            if (yn == heightLoop -1) break;
            for (int i = 0; i < 8; i++) {
                int yc = yn + 8;
                whitePrefixSum[0] += DiffBoardWhite[yc][i] - DiffBoardWhite[yn][i];
                blackPrefixSum[0] += DiffBoardBlack[yc][i] - DiffBoardBlack[yn][i];
            }
            minCnt = whitePrefixSum[0] > minCnt ? minCnt : whitePrefixSum[0];
            minCnt = blackPrefixSum[0] > minCnt ? minCnt : blackPrefixSum[0];
        }


        return minCnt;
    }
    public void setFirstBoard() {
        int whiteSum = 0;
        int blackSum = 0;
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (inputStrArr[y][x] != BoardWithWhiteStart[y][x]){
                    whiteSum++;
                }
                if (inputStrArr[y][x] != BoardWithBlackStart[y][x]){
                    blackSum++;
                }
            }

        }
//        minCnt = Math.min(minCnt, Math.min(whiteSum, blackSum));
//        whitePrefixSum[0] = whiteSum;
//        blackPrefixSum[0] = blackSum;
        whitePrefixSum[0] = whiteSum;
        blackPrefixSum[0] = blackSum;
        minCnt = Math.min(minCnt, whiteSum);
        minCnt = Math.min(minCnt, blackSum);
    }

    public static void main(String[] args) {
        try {
            int result = new BJ_1018().solution();
            System.out.println("result = " + result);
        } catch (IOException e) {
            System.out.println("IO Exception");
        }

    }
}