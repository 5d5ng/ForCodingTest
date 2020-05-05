package 동적계획법;

import java.io.*;

public class 포도주시식 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ar = new int[n +1];
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = ar[1];
        dp[2] = ar[1]+ar[2];
        dp[3] = Math.max(ar[2]+ar[3],dp[1]+ar[3]);
        dp[3] = Math.max(dp[2],dp[3]);
        for(int i = 4;i<=n;i++){
            dp[i] = Math.max(dp[i-2]+ar[i],dp[i-3]+ar[i-1]+ar[i]); //점화식
            dp[i] = Math.max(dp[i-1],dp[i]); //현재차례의 주스를 선택안하는 것이 더 손해인 경우생각
        }
        System.out.println(dp[n]);
    }
}
