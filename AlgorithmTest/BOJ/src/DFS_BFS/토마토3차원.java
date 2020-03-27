package DFS_BFS;

import java.io.*;
import java.util.*;

public class 토마토3차원 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int[][][] box = new int[h][n][m];
        boolean[][][] visit = new boolean[h][n][m];
        ArrayList<int[]> list = new ArrayList<>();
        int cntZero = 0;
        int[][] offset = {{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                    int target = box[i][j][k];
                    if (target == 0) cntZero++; //안익은 토마토 추가
                    else if (target == 1) { //익은 토마토
                        int[] ar = {i, j, k,0};
                        list.add(ar); //익은토마토 리스트에 좌표추가
                    }
                }
            }
        }
        int ans = BFS(box,visit,offset,cntZero,list);
        System.out.println(ans);
    }

    static int BFS(int[][][] box, boolean[][][] visit, int[][] offset, int cntZero, ArrayList<int[]> list) {
        if(cntZero==0) return 0;
        Queue<int[]> q = new LinkedList<>();
        for (int[] ar : list) {
            q.add(ar);
        }

        while (!q.isEmpty()) {
            int[] t = q.poll(); // 익은 토마토 좌표
            for (int i = 0; i < offset.length; i++) { //6개방향탐색
                int[] now = new int[4]; // 4번째 항이 거리
                for (int j = 0; j < 3; j++) { //각 방향으로 갔을 경우의 now좌표 저장
                    now[j] = t[j] + offset[i][j];
                }

                int h = box.length;
                int n = box[0].length;
                int m = box[0][0].length;
                if (now[0] < h && now[1] < n && now[2] < m && now[0] >= 0 && now[1] >= 0 && now[2] >= 0) {
                    if (box[now[0]][now[1]][now[2]] == 0 && !visit[now[0]][now[1]][now[2]]) {

                                               box[now[0]][now[1]][now[2]] = 1;
                                               visit[now[0]][now[1]][now[2]] = true;
                                               cntZero -- ;
                                               now[3] = t[3]+1;
                                               q.add(now);
                    }
                }
            }

            if(cntZero==0){
                return t[3]+1;
            }
        }

        return -1;

    }
}
