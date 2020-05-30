package lv1;

import java.util.*;
class 문자열_내마음대로_정렬하기
{
    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for(int i=0;i<answer.length;i++)
        {
            answer[i]= Character.toString(strings[i].charAt(n)) +strings[i];
        }
        Arrays.sort(answer);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].substring(1);
        }


        return answer;

    }
}