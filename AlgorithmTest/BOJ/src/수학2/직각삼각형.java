package 수학2;
import java.io.*;
import java.util.*;
public class 직각삼각형 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in ;
        int[] nums = new int[3];
        while (true){
            in = br.readLine().split(" ");
            for (int i = 0; i < 3 ; i++) {
                nums[i] = Integer.parseInt(in[i]);

            }
            if(nums[0]==0&&nums[1]==0&&nums[2]==0) break;

            Arrays.sort(nums);
            if(nums[0]*nums[0]+nums[1]*nums[1]==nums[2]*nums[2]) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
