package 백트래킹;

import jdk.nashorn.internal.runtime.FindProperty;

import java.io.*;
import java.util.*;
import java.util.PriorityQueue;

public class 연산자_끼워넣기 {
    static int n;
    static int[] op = new int[4];
    static int[] num;
    static ArrayList<Integer> list = new ArrayList<>();
    static int res = 0;
    static ArrayList<Integer> OrderOp = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        num = new int[n];
        String[] in = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(in[i]);
        }
        in = br.readLine().split(" ");
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(in[i]);
        }
        res = num[0];
        fun(0);
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(0));

    }
    public static void fun(int n1) {
       if(n1>=n-1){
           list.add(res);
           res = num[0];
           return;
       }
        for (int i = 0; i <4 ; i++) {
          if(op[i]>0){
              op[i]--;
              res = Compute(res,num[n1+1],i);
              fun(n1+1);
              op[i]++;
          }
        }
    }
    public static int Compute(int a,int b,int op){
        if(op==0) return a+b;
        else if(op==1) return a-b;
        else if(op==2) return a*b;
        else  return a/b;
    }
    public static void dfs(int depth,int sum){
        for (int i = 0; i < 4; i++) {
            
            
        }
    }
}
