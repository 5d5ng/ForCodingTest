package 동적계획법;
import java.io.*;
import java.util.*;
public class 정수삼각형 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int[n][n];
        int [][] dp = new int[n][n];
        StringTokenizer  st ;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<=i;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<n;i++){
            dp[0][i] = arr[n-1][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=(n-1)-i;j++){
                dp[i][j]=arr[(n-1)-i][j]+Math.max(dp[i-1][j],dp[i-1][j+1]);
            }
        }
        System.out.println(dp[n-1][0]);

    }
}
