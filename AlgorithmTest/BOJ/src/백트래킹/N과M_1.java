package 백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N과M_1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] in  = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        boolean[] visit = new boolean[n];
        int[] ar = new int[m];
        fun(n,m,0,visit,ar);
    }

    static void fun(int n,int m,int depth,boolean[] vis,int[] ar){
      if(depth==m){  //숫자를 m개 뽑은 경우 출력
         for(int i:ar)
             System.out.print(i+" ");
          System.out.println();
          return;

      }
        for (int i = 0; i <n ; i++) { //호출될때마다 0부터  끝까지 방문되었는지 확인
            if(!vis[i]){ //방문되지않은 곳이라면
                vis[i]=true; // 방문 표시
                ar[depth] = i+1; // 배열에 그 데이터 저장
                fun(n,m,depth+1,vis,ar); // 숫자를 하나 뽑았으니까 깊이 1증가
                vis[i] = false; // 다음 호출을 위해 방문표시 지움
            }
        }

    }

}
