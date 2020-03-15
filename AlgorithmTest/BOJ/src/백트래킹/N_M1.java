package 백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N_M1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] in  = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        vis = new boolean[n+1];
        res = new int[m];
        fun(n,m,0);
    }
    static boolean[] vis;
    static int[] res ;
    private static void fun(int n, int m,int depth) {
        if(depth == m ){
            for (int i = 0; i <res.length ; i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <=n ; i++) {
            if(!vis[i]){
                vis[i] = true;
                res[depth] = i;
                fun(n,m,depth+1);
                vis[i] = false;
            }
        }
    }
}
