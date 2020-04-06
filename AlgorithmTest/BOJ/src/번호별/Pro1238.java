package 번호별;

import java.io.*;
import java.util.*;

public class Pro1238 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
        int[][] Arr = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int dis = Integer.parseInt(st.nextToken());
            Arr[start][end] = dis;
        }
        int ans = -1;
        for (int i = 1; i < n + 1; i++) {
            boolean[] vis = new boolean[n + 1];
            int[] dArr = new int[n + 1];
             ans = Math.max(ans,fun(Arr, dArr, vis, i, x) + fun(Arr,dArr,vis,x,i));

        }

        System.out.println(ans);

    }

    static int fun(int[][] Arr, int[] dArr, boolean[] vis, int start, int endIndex) {
        for (int i = 1; i < dArr.length; i++) {
            dArr[i] = Integer.MAX_VALUE;
            vis[i] = false;
        }
        dArr[start] = 0;
        vis[start] = true;
        for (int i = 1; i < Arr.length; i++) {
            if (!vis[i] && Arr[start][i] > 0) { //인접노드
                dArr[i] = Arr[start][i];
            }
        }
        for (int i = 1; i < Arr.length - 1; i++) { //모든 노드 돌아보기
            int min = Integer.MAX_VALUE;
            int index = -1;

            for (int j = 1; j < Arr.length; j++) {
                if (!vis[j] && dArr[j] != Integer.MAX_VALUE) { //한번도 방문한적없고 인접한경우
                    if (dArr[j] < min) {
                        min = dArr[j];
                        index = j;
                    }
                }
            }
            vis[index] = true;
            for (int j = 1; j < Arr.length; j++) {
                if (!vis[j] && Arr[index][j] > 0) {
                    if (dArr[j] > dArr[index] + Arr[index][j]) {
                        dArr[j] = dArr[index] + Arr[index][j];
                    }
                }
            }

        }
        return dArr[endIndex];
    }

}
