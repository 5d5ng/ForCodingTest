package 동적계획법;

import java.io.*;
import java.util.*;

public class 가장긴_증가하는_부분수열 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.fill(dp, 1);
        for (int i = 2; i <= n; i++) {

            for (int j = 1; j < i; j++) { //이전에 지나온 수열들 중 가장 큰 값
                if (arr[j] < arr[i] && dp[j] >= dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int res =  0;
        for(int i:dp){
            res = Math.max(i,res);
        }
        System.out.println(res);
    }


}
