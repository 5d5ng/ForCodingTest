package test;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
public class Pro2 {
    static int[][] tile;
    static int[][] goal;
    static int m = 0, n = 0;
    static boolean flag = false;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            tile = new int[n + 1][m + 1];
            goal = new int[n + 1][m + 1];
            for (int j = 1; j <= n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= m; k++) {
                    goal[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            DFS(1,1);
            if (flag) System.out.println("YES");
            else System.out.println("NO");
            flag = false;

        }

    }
    static void Paint(int x, int y) {
        for (int i = x; i <= n && i < x + 2; i++) {
            for (int j = y; j <= m && j < y + 2; j++) {
                tile[i][j] = 1;
            }
        }
    }
    static void DePaint(int x, int y) {
        for (int i = x; i <= n && i < x + 2; i++) {
            for (int j = y; j <= m && j < y + 2; j++) {
                tile[i][j] = 0;

            }
        }
    }
    static boolean chkSame() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (tile[i][j] != goal[i][j]) return false;
            }
        }
        return true;
    }
    static void DFS(int x, int y) {
        if (chkSame()) {
           flag = true;
           return;
        }
        if (x == n && y == m) {
            return ;
        }
        if (y == m) {
            y = 1;
            x++;
        }
        //색칠안하는부분
        DFS(x, y + 1);
        //색칠한다
        Paint(x, y);
        DFS(x, y + 1);
        DePaint(x, y);
    }

}
