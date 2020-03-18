package 백트래킹;

import java.io.*;
import java.util.StringTokenizer;

public class N과M_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[] vis = new boolean[n];
        int [] ar = new int[m];
//        fun2(n,m,0,0,vis,ar);
        fun(n,m,0,vis,ar);
    }
    //방법 1
    static void fun(int n,int m,int depth,boolean[] vis,int[] ar){
        if(depth==m){ // 다 뽑은 경우
            for (int i = 0; i <ar.length ; i++) {
                System.out.print(ar[i]+" ");
            }
            System.out.println();
            return;
        }
        int i = 0;
        if(depth>0) i = ar[depth-1]; //깊이가 0이아닌 경우 이전에 선택했던 숫자를 i로 시작
        for (; i <n ; i++) {
            if(i<0) i=0;
            if(!vis[i]){
                vis[i] = true;
                ar[depth] = i+1;
                fun(n,m,depth+1,vis,ar);
                vis[i] = false;
            }
        }
    }
    //방법2
    static void fun2(int n,int m,int depth,int size,boolean[] vis,int[]ar){

        if(m==size){
            for (int i = 0; i <ar.length ; i++) {
                System.out.print(ar[i]+" ");
            }
            System.out.println();
            return;
        }
        if(depth ==n){
            return;
        }
        vis[depth] = true;
        ar[size] = depth+1;
        fun2(n,m,depth+1,size+1,vis,ar);
        vis[depth] = false;

        fun2(n,m,depth+1,size,vis,ar);



    }
}
