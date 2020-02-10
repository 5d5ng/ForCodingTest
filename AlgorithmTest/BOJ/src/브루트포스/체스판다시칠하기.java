package 브루트포스;


import sun.font.FontRunIterator;

import java.util.Scanner;

public class 체스판다시칠하기 {
    static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j);
            }
        }
        int paint = 'B';
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i + 8 <= n; i++) {
            for (int j = 0; j + 8 <= m; j++) {
                //체스판 비교 8*8
                int temp = countPaint(i, j);
                if(ans > temp) {
                    ans = temp;
                }
            }
        }
        System.out.println(ans);

    }
    private static int countPaint(int x, int y) {
        int p = 'B';
        int res1 = 0, res2 = 0;

        for (int i = x; i < x + 8; i++) {
            if (p == 'B') p = 'W';
            else p = 'B';
            for (int j = y; j < y + 8; j++) {
                if (p != board[i][j]) {
                    res1++;
                }
                if (p == 'B') p = 'W';
                else p = 'B';
            }
        }
        p = 'W';
        for (int i = x; i < x + 8; i++) {
            if (p == 'B') p = 'W';
            else p = 'B';
            for (int j = y; j < y + 8; j++) {
                if (p != board[i][j]) {
                    res2++;
                }
                if (p == 'B') p = 'W';
                else p = 'B';
            }
        }
        return Math.min(res1,res2);

    }


}

