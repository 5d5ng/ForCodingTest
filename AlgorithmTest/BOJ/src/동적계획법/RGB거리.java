package 동적계획법;

import java.io.*;
import java.util.StringTokenizer;

public class RGB거리 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] dpIndex = new int[N + 1];
        int[] dp = new int[N+1];
        int[][] rgb = new int[N + 1][3];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                rgb[i][j] = Integer.parseInt(st.nextToken());
            }

        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if(i!=j && j!=k){
                        int t = rgb[1][i]+rgb[2][j]+rgb[3][k];
                        if(min > t ){
                            min = t;
                            dpIndex[1] = i;
                            dpIndex[2] = j;
                            dpIndex[3] = k;
                            dp[1] = rgb[1][i];
                            dp[2] = dp[1] +rgb[2][j];
                            dp[3] = dp[2] +rgb[3][k];
                        }
                    }
                }
            }
        }
        for(int i=4;i<=N;i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j=0;j<3;j++){
                if(dpIndex[i-1]!=j && dp[i] > dp[i-1]+rgb[i][j]){
                    dp[i] = dp[i-1] +rgb[i][j];
                }
            }

        }

        System.out.println(dp[N]);
    }
}
