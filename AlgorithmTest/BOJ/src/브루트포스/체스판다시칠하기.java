package 브루트포스;


import sun.font.FontRunIterator;

import java.util.Scanner;

public class 체스판다시칠하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] board = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j);
            }
        }
        int paint = 'B';
int cnt = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i + 8 <= n; i++) {
            for (int j = 0; j + 8 <= m; j++) {
            cnt++;
                System.out.println(i+" "+j);
                //체스판 비교 8*8
                int res1 = 0, res2 = 0;
                for (int k = i; k < i + 8; k++) {

                    for (int l = j; l < j + 8; l++) {
                        if (board[k][l] != paint) {
                            res1++;
                        }
                        if (l < j + 7) { // 다음 행 색깔에 영향 미치지 않으려고 8*8 에서 마지막 페인트색은 다음줄 첫페인트 색과 동일해야함
                            if (paint == 'B')
                                paint = 'W';
                            else paint = 'B';
                        }
                    }
                }
                paint = 'W';
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (board[k][l] != paint) {
                            res2++;
                        }
                        if (l < j + 7) {
                            if (paint == 'B')
                                paint = 'W';
                            else paint = 'B';
                        }
                    }
                }
                if (ans > Math.min(res1, res2))
                    ans = Math.min(res1, res2);

            }
        }

        System.out.println(cnt);
        System.out.println(ans);


    }


}

