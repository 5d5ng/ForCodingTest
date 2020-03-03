package 백트래킹;

import java.io.*;
import java.util.StringTokenizer;


public class 스도쿠 {
    static int[][] board = new int[10][10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 1; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 10; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        func(1, 1);

    }

    static void func(int starti, int startj) {
        if (starti > 9 || startj > 9) {
            if (isvalid()) { //스도쿠 완성 되면?
                for (int i = 1; i < 10; i++) {
                    for (int j = 1; j < 10; j++) {
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
                }
            }

            return;
        }
        for (int i = 1; i < 10 ; i++) {
            if (validCol(starti)) { //행이 스도쿠를 만족한다면
                func(starti + 1, 1);
            } else if (valirow(starti,i)&&chkSquare(starti, startj)&& board[starti][startj] == 0) { // 스도쿠를 만족하지 않고 0이고 i 넣어도 문제가 없다면?
                board[starti][startj] = i;
                func(starti, startj + 1);
                board[starti][startj] = 0;
            }
        }
        func(starti,startj+1);

    }
    private static boolean isvalid() {
        int chk = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if(board[i][j]<1) return false;
                chk += board[i][j];
            }
        }
        return chk == (45 * 9);
    }

    private static boolean validCol(int Col) {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += board[Col][i];
        }
        return sum == 45;
    }
    private static boolean valirow(int col,int target) {

        for (int i = 1; i < 10; i++) {
            if(board[col][i]== target) return false;
        }
        return true;
    }
    private static boolean chkSquare(int i,int j){
         if(i%3>0||j%3>0) return true;
         int sum =0 ;
        for (int k = i-2; k <=i ; k++) {
            for (int l = j-2; l <=j ; l++) {
                if(board[k][l]<1) return false;
                sum+=board[k][l];
            }
        }
        return sum==45;
    }


}
