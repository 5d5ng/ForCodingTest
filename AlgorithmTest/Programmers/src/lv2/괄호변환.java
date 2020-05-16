package lv2;
import  java.util.*;
public class 괄호변환 {
    public static void main(String[] args) {
        String s = "()))((()";
        System.out.println(solution(s));
    }
    public static String solution(String p) {

        if(p.length()==0) return "";
        if(isRight(p)) return p;
        String answer = "";
        int size = p.length();
        String u = "";
        String v = "";
        String temp = "";
        boolean done = false;
        for(int i=1;i<=size;i++)
        {
            String target = p.substring(0,i);
            if(!done&&isBalanced(target)){
                done = true;
                u = target;
                v = p.substring(i);
                if(isRight(u)){
                    v=solution(v);
                   return u+v;
                }
                else{
                   answer+="(";
                   answer+=solution(v);
                   answer+=")";
                   u = u.substring(1,u.length()-1);
                   for(int j=0;j<u.length();j++){
                       if(u.charAt(j)=='(')  answer+=")";
                       else answer+="(";
                   }

                }
            }

        }
        return answer;
    }
    static boolean isRight(String s){
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('){
              cnt1++;
            }
            else{ // ')'인 경우
                cnt2++;
            }
            if(cnt2>cnt1) return false;

        }
        return cnt1==cnt2;
    }
    static boolean isBalanced(String s){
        int cnt1=0, cnt2 = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(') cnt1++;
            else cnt2++;
        }
        return cnt1==cnt2;
    }
}
