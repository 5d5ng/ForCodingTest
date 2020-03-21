package DFS_BFS;

import java.io.*;
import java.util.*;

public class 단지번호붙이기 {
    static int[] offset = {1, -1, 0, 0};
    static int[] offset2 = {0, 0, 1, -1};
    static int res;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        boolean[][] visit = new boolean[n][n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] in = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(in[j]);
            }
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if(map[i][j]==1 && !visit[i][j]){
                    res= fun(i,j,map,visit);
                    list.add(res);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i:list)
            System.out.println(i);
    }


    static int Maze(int x, int y, int[][] map, boolean[][] visit) {
        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int tx = x + offset[i];
            int ty = y + offset2[i];
            if (tx < map.length && ty < map.length && ty >= 0 && tx >= 0) {

                if (map[tx][ty] == 1 && !visit[tx][ty]) {
                    Maze(tx, ty, map, visit);
                    res++;
                }
            }

        }
        return res;
    }

    static int fun(int x,int y,int[][] map , boolean[][] visit){
        if(x>=map.length||y>=map.length||x<0||y<0||map[x][y]==0||visit[x][y]){
            return 0;
        }
        visit[x][y] = true;
        return 1+fun(x+1,y,map,visit)+fun(x-1,y,map,visit)+fun(x,y+1,map,visit)+fun(x,y-1,map,visit);
    }

}
