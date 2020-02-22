package 백트래킹;

import java.io.*;

public class N_Queen {
    static int[][] board;
    static int n, cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n + 1][n + 1];
        NQueen(1);
        System.out.println(cnt);

    }

    public static void NQueen(int num) {
        if (num == n+1) {//n행 까지 다놓은 상태라면 조건을 만족하는 경우
            cnt++;
            return;
        }
        for (int i = 1; i <= n; i++) { // 놓는 열 설정
            if (isvalid(num, i)) { // 놓을 수 있다면
                board[num][i] = 1; // 놓고
                NQueen(num + 1);   // 다음 행
                board[num][i] = 0;  // 호출되고나서 지우기
            }
        }

    }
    private static boolean isvalid(int num, int j) { //열을 매개변수로 입력받음
        int flag = 1;
        while (num - flag > 0) {
            if (board[num - flag][j] == 1) {
                return false;
            }
            flag++;
        }
        flag = 1;
        while (num - flag > 0 && j - flag > 0) {
            if (board[num - flag][j - flag] == 1) {
                return false;
            }
            flag++;
        }
        flag = 1;
        while (num - flag > 0 && j + flag <= n) {
            if (board[num - flag][j + flag] == 1) {
                return false;
            }
            flag++;
        }
        return true;
    }


}
