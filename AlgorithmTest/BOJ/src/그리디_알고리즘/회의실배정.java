package 그리디_알고리즘;
import java.io.*;
import java.util.*;
public class 회의실배정
{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] meet = new int[n][2];
        for (int i = 0; i <n ; i++) {
            StringTokenizer st  = new StringTokenizer(br.readLine());
            meet[i][0] = Integer.parseInt(st.nextToken());
            meet[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(meet, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o1[0] - o2[0];
                }
                else return o1[1]-o2[1];
            }
        });
        int endT = -1;
        int res = 0;
        for (int i = 0; i < meet.length; i++) {
            if(meet[i][0]>=endT){
                endT = meet[i][1];
                res++;
            }
        }
        System.out.println(res);
    }
}
