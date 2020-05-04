package 동적계획법;

import java.io.*;

public class 쉬운계단수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
         int  flag = 1000000000;
        long[][] dp = new long[12][N+1];
        dp[0][1] = 0;

        for(int i=2;i<=10;i++) //n이 1 인 경우
            dp[i][1] = 1;


        for(int i=2;i<=N;i++){
            for(int j=1;j<=10;j++){
                dp[j][i] = dp[j-1][i-1]%flag +dp[j+1][i-1]%flag;
                dp[j][i] %=flag;

            }
        }
        long res = 0;
        for(int j=1;j<=10;j++){
            res += dp[j][N];
            res%=flag;
        }
        System.out.println(res);
    }
}
