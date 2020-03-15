package 백트래킹;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;

import java.io.*;
import java.util.StringTokenizer;

public class 스타트와_링크2 {
    static int n;
    static boolean [] visited;
    static int [][] player;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n+1];
        player = new int[n+1][n+1];

        for (int i = 1; i <=n ; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1;j<=n;j++)
            {
                player[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        makeTeam(1,0);
        System.out.println(min);
    }
    public static void makeTeam(int start,int depth){
        if(depth == n/2){
            min  = Math.min(getAblity(),min);
            return;
        }
        for (int i = start; i <=n; i++) {
            if(!visited[i] ){
                visited[i] = true;
                makeTeam(i+1,depth+1);
                visited[i] = false;
            }
        }
    }
    static int getAblity(){
        int sumStart = 0;
        int sumLink = 0;

        for (int i = 1; i < n+1 ; i++) {
            for (int j = 1; j < n+1 ; j++) {
                if(visited[i]  && visited[j]) // 둘다 스타트팀인 경우
                {
                    sumStart+=player[i][j];
                }
                if(!visited[i] && !visited[j]) // 둘다 링크 팀인 경우
                {
                    sumLink+=player[i][j];
                }
            }

        }
        return Math.abs(sumStart-sumLink);
    }
}
