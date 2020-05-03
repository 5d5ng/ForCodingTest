package 동적계획법;

import java.io.*;

public class 계단오르기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n + 1][2];
        int[] stair = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
        dp[1][0] = stair[1];
        if (n > 1) {
            dp[2][0] = dp[1][0] + stair[2];
            dp[2][1] = stair[2];
        }
        for (int i = 3; i <= n; i++) {
            dp[i][0] = dp[i - 1][1] + stair[i]; // 이전에 두칸을 간 경우만 한칸을 갈 수 있기 때문에 바로dp[i-1][1] 을 더한다.
            dp[i][1] = Math.max(dp[i - 2][0], dp[i - 2][1]) + stair[i];
        }
        if (n == 1) System.out.println(stair[1]);
        else
            System.out.println(Math.max(dp[n][0], dp[n][1]));
    }


}
