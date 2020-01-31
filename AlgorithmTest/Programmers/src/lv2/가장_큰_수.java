package lv2;

import java.awt.color.CMMException;
import java.util.Arrays;
import java.util.Comparator;

public class 가장_큰_수 {

    public static void main(String[] args) {
        가장_큰_수 app = new 가장_큰_수();
        int [] test = {6,10,2};

        app.solution(test);
    }
    String res = "";
    public String solution(int[] numbers) {
        String answer = "";
        String [] snum = new String[numbers.length];
        for(int i=0;i<numbers.length;i++) {
            snum[i] = Integer.toString(numbers[i]);

        }
        Arrays.sort(snum,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }

        });
        for(String s : snum)
            answer+=s;
        if(answer.charAt(0)=='0')
            return "0";
        return answer;
    }

}
