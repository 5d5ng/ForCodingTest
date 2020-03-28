package 그리디_알고리즘;
import java.io.*;
import java.util.*;
public class ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] time = new int[n];
        int ans = 0;
        for (int i=0;i<time.length;i++){
            time[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(time);

        for (int i = 0; i < n; i++) {
            for(int j=0;j<=i;j++){
                ans+=time[j];
            }
        }
        System.out.println(ans);
    }

}
