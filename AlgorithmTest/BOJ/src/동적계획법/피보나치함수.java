package 동적계획법;

import java.io.*;
import java.util.Arrays;

public class 피보나치함수 {
    static long[] res = new long[40];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            int [][] ar = new int[temp+1][2];
            if(temp==0){
                System.out.println(1+" "+0);
                continue;
            }
            else if(temp==1){
                System.out.println(0+" "+1);
                continue;
            }
            ar[0][0] = 1;
            ar[1][1] = 1;
            for(int j=2;j<=temp;j++){
                ar[j][0] = ar[j-1][0]+ar[j-2][0];
                ar[j][1] = ar[j-1][1]+ar[j-2][1];
            }
            System.out.println(ar[temp][0]+" "+ar[temp][1]);
        }

    }

}
