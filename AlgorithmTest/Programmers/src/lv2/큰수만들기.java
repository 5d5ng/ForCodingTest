package lv2;

import java.util.ArrayList;

public class 큰수만들기 {
    public static void main(String[] args) {
        String s ="4177252841";

        System.out.println(solution(s,4));
    }
    public static String solution(String number,int k) {
        String answer = "";
        int len = number.length();
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            num.add(Integer.parseInt(number.substring(i,i+1)));
        }
        int make = len-k; //자릿수
        while(answer.length()<len-k) {
            int max = -1;
            int maxIndex = -1;
            for(int i=0;i<len-make;i++){
                if(num.get(i)>max){
                    max = num.get(i);
                    maxIndex = i;
                }

            }
            answer+=Integer.toString(max);
            num.remove(maxIndex);
            make--;
        }
        return answer;
    }
}
