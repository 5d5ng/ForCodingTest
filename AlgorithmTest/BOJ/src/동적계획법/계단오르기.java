package 동적계획법;
import java.io.*;
public class 계단오르기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] dp = new int[n+1];
        int [] stair = new int[n+1];
        for (int i = 1; i <= n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = stair[n];
        for(int i=2;i<=n;i++){
           if(i+2<=n) {
               dp[i] = dp[i - 1] + Math.max(stair[i], stair[i + 2]);

        }


    }
}
