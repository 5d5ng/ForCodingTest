package test;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Pro2 {
    static int[][] tile;
    static int[][] goal;
    static int m = 0, n = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            tile = new int[n+1][m+1];
            goal = new int[n+1][m+1];
            for (int j = 1; j <= n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= m; k++) {
                    goal[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            if (DFS(1, 1)) System.out.println("YES");
            else System.out.println("NO");

        }

    }

    static void Paint(int i, int j) {
        for (; i < n && i < i + 2; i++) {
            for (; j < m && j < j + 2; j++) {
                tile[i][j] = 1;
            }
        }
    }

    static void DePaint(int i, int j) {
        for (; i < n && i < i + 2; i++) {
            for (; j < m && j < j + 2; j++) {
                tile[i][j] = 0;
            }
        }
    }

    static Boolean chkSame() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (tile[i][j] != goal[i][j]) return false;
            }
        }
        return true;
    }

    static boolean DFS(int x, int y) {
        if(x==n||y==m){
            return chkSame();
        }

        Paint(x,y);
        DFS(x+1,y);
        DePaint(x,y);

        Paint(x,y);
        DFS(x,y+1);
        DePaint(x,y);

        Paint(x,y);
        DFS(x+1,y+1);
        DePaint(x,y);

        return false;
    }


}
