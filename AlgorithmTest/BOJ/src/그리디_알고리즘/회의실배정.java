package 그리디_알고리즘;
import java.io.*;
import java.util.*;
public class 회의실배정
{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] meeting = new int[n][2];
        int finishTime = 0;
        for (int i = 0; i <n ; i++) {
            StringTokenizer st  = new StringTokenizer(br.readLine());
            meeting[i][0] = Integer.parseInt(st.nextToken());
            meeting[i][1] = Integer.parseInt(st.nextToken());
            if(meeting[i][1]>finishTime) finishTime = meeting[i][1];
        }
        int[] timeT = new int[finishTime+1];
        int max = Integer.MIN_VALUE;
        Arrays.sort(meeting, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int[] ar:meeting){
            System.out.println(ar[0]);
        }

    }
    static boolean isTrue(int[] T){
        for(int i:T){
            if(i>1) return false;
        }
        return true;
    }
}
