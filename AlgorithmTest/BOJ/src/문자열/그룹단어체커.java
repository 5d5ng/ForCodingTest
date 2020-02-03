package 문자열;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 그룹단어체커 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
    }
    public static boolean solution(String s){
        
        return true;
    }


    //런타임 에러 나오는 풀이
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int limit = sc.nextInt();
//        int cnt = 0;
//
//        for (int i = 0; i < limit; i++) {
//            if (checker(sc.next()))
//                cnt++;
//        }
//        System.out.println(cnt);
//    }
//
//    public static boolean checker(String s) {
//        if (s.length() <= 1) return true;
//
//        PriorityQueue<Character> chk = new PriorityQueue<>();
//        for (int i = 0; i < s.length() - 1; i++) {
//            if (s.charAt(i) != s.charAt(i + 1)) {
//                chk.add(s.charAt(i));
//            }
//        }
//        if (s.charAt(s.length() - 1) != s.charAt(s.length() - 2)) {
//            chk.add(s.charAt(s.length() - 1));
//        }
//        char c = chk.poll();
//        while (!chk.isEmpty()) {
//            if (chk.peek() == c) return false;
//
//            c = chk.poll();
//        }
//
//        return true;
//    }
}
