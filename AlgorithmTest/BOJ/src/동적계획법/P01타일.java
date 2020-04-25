package 동적계획법;

import java.io.*;
public class P01타일 {
    //점화식 한칸씩전진할떄 어떤값이 나오는지 알고 규칙을 찾아야함
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp  = new long[n+1];

        dp[1] = 1;
        if(n>1)
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-2]+dp[i-1];
            dp[i]%=15746;
        }
        System.out.println(dp[n]);
    }

}
