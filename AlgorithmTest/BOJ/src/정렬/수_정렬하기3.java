package 정렬;

import java.io.*;

public class 수_정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int [] nums = new int[n];
        int [] count = new int[10001];
        int cnt = 0;
        for (int i = 0; i <n ; i++) {
            nums[i]  = Integer.parseInt(br.readLine());
        }
        for(int i: nums){
            count[i] ++;
        }
        for(int i= 0;i<10001;i++) {
            if (count[i]> 0) {
                for (int j = 0; j < count[i]; j++) {
                    bw.write(i+"\n");
                }
            }
        }
        bw.close();
        br.close();
    }
}

