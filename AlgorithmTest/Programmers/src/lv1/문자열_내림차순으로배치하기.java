package lv1;


import  java.util.*;
public class 문자열_내림차순으로배치하기 {
    public static void main(String[] args) {
        String s="Zbcdefg";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        String answer = "";
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            list.add(s.charAt(i));
        }
        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                if(o1<o2) return 1;
                else if(o1==o2) return 0;
                else return -1;
            }
        });
        for(char c:list){
            answer+=Character.toString(c);
        }
        return answer;
    }

    public static String solution2(String s) {
        char [] ar = s.toCharArray();
        Arrays.sort(ar);
        StringBuilder sb = new StringBuilder(new String(ar)).reverse();
        return sb.toString();
    }
}
