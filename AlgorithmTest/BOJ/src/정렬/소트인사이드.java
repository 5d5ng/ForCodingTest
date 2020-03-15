package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;



public class 소트인사이드 {
    //풀이 1
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        char[] nums = input.toCharArray();
//        Arrays.sort(nums);
//        for(int i = nums.length-1;i>=0;i--)
//            System.out.print(nums[i]);
//
//
//    }
    //풀이 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }
        Collections.sort(list,Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }


    }
}
