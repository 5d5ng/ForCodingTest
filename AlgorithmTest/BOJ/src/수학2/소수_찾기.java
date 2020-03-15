package 수학2;

import java.io.*;
import java.util.StringTokenizer;

public class 소수_찾기 {
    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());

        }
        System.out.println(countPrime(nums));
    }
    public static int countPrime(int[] nums) {
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<=1) {
                ans -- ;
                continue;
            }
            for (int j = 2; j < nums[i]; j++) {
                if(nums[i]%j==0){
                    ans--;
                    break;
                }
            }

        }
        return ans;
    }
}
