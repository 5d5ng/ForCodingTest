package 동적계획법;
import  java.io.*;
import java.util.*;

public class 가장_긴_바이토닉_부분수열 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n+1];

        for (int i = 1; i <=n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());

        }
        int[] up = new int[n+1];
        int[] down = new int[n+1];
        Arrays.fill(up,1);
        Arrays.fill(down,1);
        for (int i = 1; i<=n ; i++) {

            for(int j=1;j< i;j++){ //j to i
                if(nums[j]<nums[i] &&up[j]+1>up[i]) {
                    up[i] = up[j]+1;
                }
                if(nums[n-j+1]<nums[n-i+1] && down[n-j+1]+1>down[n-i+1]){
                    down[n-i+1] = down[n-j+1]+1;
                }
            }
        }
        int res = 0;
        for(int i=1;i<=n;i++){
            System.out.println("down[i] "+down[i]);
            res = Math.max(res,up[i]+down[i]-1);
        }
        System.out.println(res);


    }
}
