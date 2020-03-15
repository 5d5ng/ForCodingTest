package 백트래킹;

import java.io.*;

public class N과M_1 {
    static int n, m;
    static int[] visited ;
    static int[] res;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        visited = new int[n+1];
        res = new int [m+1];
        DFS(0);

    }
    public static void DFS(int num) {

        if(num == m){ //수열의 사이즈를 다채웠다면
            for (int i = 0; i < m; i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) { // 사용할 수 있는 수 1부터  n까지 다 넣어봄
            if(visited[i] == 0){
                visited[i] = 1; //방문 표시
                res[num] = i; //수열 저장
                DFS(num+1); //다음 칸 전진
                visited[i] = 0; // 방문표시 제거
            }

        }


    }


}
