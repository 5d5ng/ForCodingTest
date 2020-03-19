package 백트래킹;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과M_4_2 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        Arrays.fill(arr,-1);
       fun(n,m,arr,0,0);
        System.out.println(sb);
    }
    static  void fun(int n,int m,int[] ar,int depth,int size){
        if(size==m){
            for(int i:ar){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        if(depth==n){
            return;
        }
        for (int i = 0; i <n ; i++) {
            if(size==0 || ar[size-1]<=i+1){ //처음 호출되거나 선택할 숫자가 이전에 선택한것 이상이라면 추가
                ar[size] = i+1;
                fun(n,m,ar,depth+1,size+1);
            }
        }
    }
}
