package 백트래킹;

import java.io.*;

public class N과M_2 {
    static int[] visited;
    static int[] res;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        visited = new int[n+1];
        res = new int[m+1];
        fun(0);

    }
    public static void fun(int num) {
        if (num == m) { // 수열이 m까지 차면 무조건 종료
            if(isvalid()) { //츌력할 자격이 있다면? 출력 후 종료
                for (int i = 0; i < m; i++)
                    System.out.print(res[i] + " ");
                System.out.println();
            }
            return;
        }
        for (int i = 1; i <= n ; i++) { //1부터 시작해서 방문했는지 확인
            if (visited[i] == 0) { //방문한적 없다면
                visited[i] = 1; //방문 표시 후
                res[num] = i;
                fun(num + 1); //한 칸 전진
                visited[i] = 0;
            }
        }
    }
    public static boolean isvalid(){
        for (int i = 1; i < m; i++) {
            if(res[i-1]>res[i])
                return false;
        }
        return true;
    }
}
