package DFS_BFS;

import java.io.*;
import java.util.*;

class P {
    int y, x, hop;

    P(int y, int x, int hop) {
        this.y = y;
        this.x = x;
        this.hop = hop;
    }
}

public class 토마토 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] maze = new int[n][m];
        int cntZero = 0;
        ArrayList<P> tomato = new ArrayList<P>();
        boolean[][] visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                maze[i][j] = Integer.parseInt(st.nextToken());
                if (maze[i][j] == 1) tomato.add(new P(i, j, 1));
                else if(maze[i][j]==0) cntZero++;
            }
        }
        int ans = BFS(maze, visit, tomato,cntZero);
        System.out.println(ans);
    }

    static int BFS(int[][] maze, boolean[][] visit, ArrayList<P> tomato,int cntZero) {
        int ans = Integer.MAX_VALUE;
        Queue<P> q = new LinkedList<>();

        for (P point : tomato) {
            q.add(point);
        }
        if (cntZero==0) return 0;

        while (!q.isEmpty()) {
            P p = q.poll();
            visit[p.y][p.x] = true;

            if (p.y + 1 < maze.length && !visit[p.y + 1][p.x] && maze[p.y + 1][p.x] == 0) {
                visit[p.y + 1][p.x] = true;
                cntZero--;
                maze[p.y + 1][p.x] = 1;
                q.add(new P(p.y + 1, p.x, p.hop + 1));
            }
            if (p.y - 1 >= 0 && !visit[p.y - 1][p.x] && maze[p.y - 1][p.x] == 0) {
                visit[p.y - 1][p.x] = true;
                cntZero--;
                maze[p.y - 1][p.x] = 1;
                q.add(new P(p.y - 1, p.x, p.hop + 1));
            }
            if (p.x + 1 < maze[0].length && !visit[p.y][p.x + 1] && maze[p.y][p.x + 1] == 0) {
                visit[p.y][p.x + 1] = true;
                cntZero--;
                maze[p.y][p.x + 1] = 1;
                q.add(new P(p.y, p.x + 1, p.hop + 1));
            }
            if (p.x - 1 >= 0 && !visit[p.y][p.x - 1] && maze[p.y][p.x - 1] == 0) {
                visit[p.y][p.x - 1] = true;
                cntZero--;
                maze[p.y][p.x - 1] = 1;
                q.add(new P(p.y, p.x - 1, p.hop + 1));
            }

            if (cntZero==0) return p.hop;

        }
        return -1;


    }

}
