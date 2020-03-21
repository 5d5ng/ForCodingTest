package DFS_BFS;

import java.io.*;
import java.util.*;

public class 바이러스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int pair = Integer.parseInt(st.nextToken());
        boolean[][] G = new boolean[n + 1][n + 1];
        boolean [] visit = new boolean[n+1];
        for (int j = 0; j < pair; j++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            G[x][y] = true;
            G[y][x] = true;
        }
        DFS(G,visit,1);
        int res = 0;
        for (int i = 1; i <=n ; i++) {
            if(visit[i])res++;
        }
        System.out.println(res-1);

    }
    static void DFS(boolean[][] G,boolean[] visit,int index){
        visit[index] = true;
        for (int i=1;i<G.length;i++){
            if(G[index][i] && !visit[i] ){
                DFS(G,visit,i);
            }
        }
    }
}
