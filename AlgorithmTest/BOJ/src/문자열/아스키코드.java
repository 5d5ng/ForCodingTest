package 문자열;

import java.util.Scanner;

public class 아스키코드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println((int)input.charAt(0));
    }
}
