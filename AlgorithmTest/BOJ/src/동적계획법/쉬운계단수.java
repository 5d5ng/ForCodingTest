package 동적계획법;

import java.io.*;

public class 쉬운계단수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //n의 자리 1의자리 9개 2 일때 17개
        long[] dp = new long[(N + 1)];
        dp[1] = 9;
        if (N > 1) {
            dp[2] = 17;
            for (int i = 3; i <= N; i++) {
                dp[i] = 17 * dp[i - 1];
                dp[i] %= 1000000000;
            }
        }
        System.out.println(dp[N]);
    }
}
