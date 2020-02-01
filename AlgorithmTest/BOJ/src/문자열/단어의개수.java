package 문자열;

import java.util.Scanner;

public class 단어의개수 {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = 0;
//        String s = sc.nextLine();
//        if (s.charAt(0) != ' ') cnt++;
//        for (int i = 0; i < s.length() - 1; i++) {
//            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//    }

    //다른 풀이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim(); // 입력받은 문자열의 앞과 뒤의 공백을 제거해주는 기능 : trim()
        sc.close();


        System.out.println(input);
        if(input.isEmpty())
        {
            System.out.println(0);

        }
        else{
            System.out.println(input.split(" ").length);
        }

    }

}
