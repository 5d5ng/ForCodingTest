package 번호별;

import java.io.*;

public class Pro1463 {
    static int []ar ;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ar = new int[n+1];
        ar[0] = ar[1] = 0;
        for(int i=2;i<=n;i++){
            ar[i] = ar[i-1] + 1;
            if(i%2==0) ar[i] = Math.min(ar[i/2]+1,ar[i]);
            if(i%3==0) ar[i] = Math.min(ar[i/3]+1,ar[i]);
        }
        System.out.println(ar[n]);
    }

}
