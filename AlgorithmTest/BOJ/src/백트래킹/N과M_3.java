package 백트래킹;

import java.io.*;
import java.util.StringTokenizer;

public class N과M_3 {
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws Exception {
        BufferedReader  br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int []ar = new int[m];
        fun(n,m,ar,0);
        bw.flush();
        bw.close();
    }
    static void fun(int n,int m,int[]ar ,int size) throws IOException {
        if(size ==m){
            for(int i:ar){
                bw.write(i+" ");
            }
            bw.write("\n");
            return;
        }
        for (int i = 0; i <n ; i++) {
            ar[size] = i+1;
            fun(n,m,ar,size+1);
        }
    }
}
