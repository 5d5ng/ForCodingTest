package 동적계획법;

import java.io.*;
import java.util.StringTokenizer;

public class RGB거리 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[][] dp = new int[N + 1][3]; //같은 색을 연속할 수 없기 때문에 다른 두가지 색중 최소값만 더한다
        int[][] rgb = new int[N + 1][3]; //비용 저장
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                rgb[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 3; i++) {
            dp[1][i] = rgb[1][i];
        }
        for(int i=2;i<=N;i++){
            dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2])+rgb[i][0];
            dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2])+rgb[i][1];
            dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1])+rgb[i][2];
        }
        int res = Math.min(Math.min(dp[N][0],dp[N][1]),dp[N][2]);
        System.out.println(res);

    }
}
