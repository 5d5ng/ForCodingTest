package 동적계획법;

import java.io.*;

public class 포도주시식 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ar = new int[n + 1];
        int[][] dp = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }
        for(int i=1;i<=n;i++)
        {
            dp[i][1] = ar[i];
            dp[i][2] = dp[i-1][1] + ar[i];
        }
        for (int i = 3; i <=n ; i++) {
            for(int j=3; j<=n;j++){
                dp[i][j] = dp[i-1][j-2] +dp[i][1];
            }
        }
        int res = 0;
        for (int i = 1; i <=n ; i++) {
            res =Math.max(dp[n][i],res);
        }
        System.out.println(res);


    }
}
