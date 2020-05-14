package lv2;

import java.util.ArrayList;

public class 큰수만들기 {
    public static void main(String[] args) {
        String s ="4377252841";

        System.out.println(solution(s,4));
    }
    public static String solution(String number,int k) {
        StringBuilder sb = new StringBuilder();
        int len = number.length();
        int[]num = new int[len];
        for(int i=0;i<len;i++)
        {
            num[i] = Integer.parseInt(number.substring(i,i+1));
        }
        int i = 0,j=0;
        int make = len-k;
        while(i<len) {
            int max = -1;
            int maxIndex =-1;
            for (; i <= len - make + j; i++) {
                if (max < num[i]) {
                    max = num[i];
                    maxIndex = i;
                }
            }
            sb.append(max);

            num[maxIndex] = -1;
            i = maxIndex+1;
            j++;
            if(sb.length()==make)break;
        }

        return sb.toString();
    }
}
