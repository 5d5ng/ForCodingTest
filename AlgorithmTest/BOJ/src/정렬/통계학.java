package 정렬;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class 통계학 {
    static int[] nums ;
    static int[] chk = new int[8001];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        nums = new int[n];
        double avg = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            chk[nums[i]+4000]++;
            avg += nums[i];
        }
        int maxIndex = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <8001; i++) {
            if(chk[maxIndex]<chk[i]){
                maxIndex = i;
                list.clear();
            }
            else if(chk[i]!= 0 &&chk[i] == chk[maxIndex])
            {
                list.add(i-4000); //두번째 최빈값부터 계속 리스트에 추가
            }
        }
        Arrays.sort(nums);
        System.out.println((int)Math.round((double)(avg/n))) ;
        System.out.println(nums[n/2]);
        if(list.size()!= 0)
            System.out.println(list.get(0));
        else
            System.out.println(maxIndex-4000);
        System.out.println(nums[n-1]-nums[0]);
    }
}
