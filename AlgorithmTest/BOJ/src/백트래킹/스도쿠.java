package 백트래킹;

import java.io.*;
import java.util.*;

class P {
    int x, y;

    public P(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 스도쿠 {
    static int[][] board = new int[10][10];
    static int countBlank = 0;
    static ArrayList<P> blank = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 1; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 10; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 0) {
                    countBlank++;
                    blank.add(new P(i, j));
                }
            }
        }

        fun(0);

    }

    static void fun(int idx) {
        if (idx == blank.size()) {
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.exit(1);
            return;

        }
        P p = blank.get(idx);
        for (int i = 1; i < 10; i++) {
            if (isValid(p.x, p.y, i)) {
                board[p.x][p.y] = i;
                fun(idx + 1);
                board[p.x][p.y] = 0;
            }
        }
    }

    private static boolean isValid(int x, int y, int target) {
        for (int j = 1; j < 10; j++) { //가로 세로 확인
            if (target == board[j][y] || board[x][j] == target) return false;
        }
        int k = (x-1) / 3*3 +1;
        int l = (y-1) / 3*3 +1;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(board[i+k][j+l]==target) return false;
            }
        }

        return true;
    }


}
