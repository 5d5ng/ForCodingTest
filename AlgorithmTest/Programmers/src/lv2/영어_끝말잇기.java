package lv2;

import java.util.ArrayList;

public class 영어_끝말잇기 {
    public static void main(String[] args) {

    }
    public static int[] solution(int n,String[] words){
        int [] answer= {0,0};
        ArrayList<String> used  = new ArrayList<>();
        used.add(words[0]);
        for(int i=1;i<words.length;i++){
            String now = words[i];
            String prev = words[i-1];
            if(prev.charAt(prev.length()-1) != now.charAt(0) || isUsed(used,now) ){
                answer[0] = i % n + 1;
                answer[1] = (int) Math.ceil((double) (i+1)/n);
                return answer;
            }
            used.add(now);
        }
        return answer;
    }
    public static boolean isUsed(ArrayList<String> list,String now){
        for (String s:list){
            if(s.equals(now)){
                return true;
            }
        }
        return false;
    }
}
