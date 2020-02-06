package 문자열;

import sun.security.util.Length;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 그룹단어체커 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (solution(s)) cnt++;

        }
        System.out.println(cnt);
    }

    public static boolean solution(String s) {
        if (s.length() <= 1) return true;

        ArrayList<Character> chk = new ArrayList<>();
        char temp = ' ';
        for (Character c : s.toCharArray()) {

            if (temp != c) {
                chk.add(c);
            }
            temp = c;
        }
        chk.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < chk.size() - 1; i++) {
            if (chk.get(i) == chk.get(i + 1)) return false;

        }
        return true;
    }
    // 다른 풀이
    public static boolean solution2(String s){
        boolean[] alpa = new boolean[26];
        int length = s.length();
        for (int i = 0; i < s.length() ; i++) {
            char temp = s.charAt(i);
            if(alpa[temp]){
                return false;
            }
            else {
                if(i < length -1 && temp != s.charAt(i+1)){
                    alpa[temp-'a'] = true;
                }
            }

        }
        return true;
    }
}
