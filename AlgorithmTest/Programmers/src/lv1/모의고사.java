package lv1;

import java.util.ArrayList;

public class 모의고사 {

    public static void main(String[] args) {
        int []  a= {1,3,2,4,2};
        int [] ans = solution(a);
        for(int i:ans) System.out.println(i);
    }
    public static int[] solution(int[] answers) {
        int[] answer ={};
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
        int ans1 = 0 , ans2 = 0, ans3 = 0;

        for(int i=0;i<answers.length;i++){
            if(s1[i%s1.length] ==answers[i]) ans1++;
            if(s2[i%s2.length] ==answers[i]) ans2++;
            if(s3[i%s3.length] ==answers[i]) ans3++;
        }

        int max = Math.max(Math.max(ans1,ans2),ans3);
        ArrayList<Integer> list = new ArrayList<>();
        if(max== ans1) list.add(1);
        if(max== ans2) list.add(2);
        if(max== ans3) list.add(3);

        answer = new int [list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
