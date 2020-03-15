package 백트래킹;

import java.io.*;

public class 연산자_끼워넣기다시 {
    static int[] nums;
    static int[] op = new int[4];
    static int n, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    static int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        String[] in = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(in[i]);
        }
        in = br.readLine().split(" ");
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(in[i]);
        }
        fun(1, nums[0]);
        System.out.println(max);
        System.out.println(min);
    }

    public static void fun(int depth, int sum) {
        if (depth > n - 1) {
            max = Math.max(sum, max);
            min = Math.min(sum, min);
            return;
        }
        if (op[0] > 0) {
            op[0]--;
            fun(depth + 1, sum + nums[depth]);
            op[0]++;
        }
        if (op[1] > 0) {
            op[1]--;
            fun(depth + 1, sum - nums[depth]);
            op[1]++;;
        }
        if (op[2] > 0) {
            op[2]--;
            fun(depth + 1, sum * nums[depth]);
            op[2]++;;
        }
        if (op[3] > 0) {
            op[3]--;
            fun(depth + 1, sum / nums[depth]);
            op[3]++;;
        }

    }
}
