package DFS_BFS;

import java.util.*;
import java.io.*;

public class 유기농배추 {
    static int m,n;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {

            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] field = new int[n][m];
            int[][] spot = new int[k][2];
            boolean[][] visit = new boolean[n][m];
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                spot[j][0] = y;
                spot[j][1] = x;
                field[y][x] = 1;
            }
            int res = 0;
            for (int j = 0; j < spot.length; j++) {

                int ty = spot[j][0];
                int tx = spot[j][1];
                if (!visit[ty][tx]) {
                    DFS(ty, tx, visit, field);
                    res++;
                }
            }
            sb.append(res).append("\n");
        }
        System.out.println(sb);
    }
    static void DFS(int y,int x,boolean[][] visit,int[][]field){
        if(y<0||x<0||x>=m||y>=n||visit[y][x]||field[y][x]==0){
            return;
        }
        visit[y][x] = true;
        DFS(y+1,x,visit,field);
        DFS(y-1,x,visit,field);
        DFS(y,x+1,visit,field);
        DFS(y,x-1,visit,field);
    }
}
