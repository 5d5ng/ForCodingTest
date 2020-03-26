package DFS_BFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Point{
    int y,x,hop;
    Point(int y,int x,int hop){
        this.y = y;
        this.x = x;
        this.hop = 0;
    }
}
public class 미로탐색 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [][] maze = new int[n+1][m+1];
        boolean [][] visit = new boolean[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            String [] in = br.readLine().split("");
            for (int j = 1; j <=m; j++) {
                maze[i][j] = Integer.parseInt(in[j-1]);
            }
        }
        int ans =BFS(maze,visit,1,1);
        System.out.println(ans);
    }

    static int BFS(int[][]maze,boolean[][]visit,int y,int x){

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(y,x,0));
        while(!q.isEmpty()) {
            Point p = q.poll();
            if(p.y==maze.length&&p.x==maze[0].length){
                return p.hop;
            }
            if (x + 1 <= maze[0].length - 1 && !visit[y][x + 1] && maze[y][x + 1] == 1) {
                visit[y][x + 1] = true;
                q.add(new Point(y, x + 1,p.hop+1));

            }
            if (y + 1 <= maze.length - 1 && !visit[y + 1][x] && maze[y + 1][x] == 1) {
                visit[y + 1][x] = true;
                q.add(new Point(y + 1, x,p.hop+1));

            }
            if (x - 1 >= 1 && !visit[y][x - 1] && maze[y][x - 1] == 1) {
                visit[y][x - 1] = true;
                q.add(new Point(y, x - 1,p.hop+1));
            }
            if (y - 1 >= 1 && !visit[y - 1][x] && maze[y - 1][x] == 1) {
                visit[y - 1][x] = true;
                q.add(new Point(y - 1, x,p.hop+1));
            }
        }
        return -1;

    }
}
