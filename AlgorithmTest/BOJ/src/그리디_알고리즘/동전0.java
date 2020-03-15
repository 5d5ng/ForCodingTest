package 그리디_알고리즘;

import java.io.*;
import java.util.StringTokenizer;

public class 동전0 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) coin[i] = Integer.parseInt(br.readLine());
        int cnt = 0;
        int now = 0;
        for (int i = coin.length - 1; i >= 0; i--) {
                while(now+coin[i]<k){
                    now+=coin[i];
                    cnt++;
                }

                if(now+coin[i]==k){
                    cnt++;
                    break;
                }
        }
        System.out.println(cnt);
    }
}
