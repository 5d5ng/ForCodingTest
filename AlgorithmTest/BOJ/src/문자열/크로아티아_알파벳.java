package 문자열;

import java.util.Scanner;

public class 크로아티아_알파벳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int cnt = 0;
        String[] Calpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (int i = 0; i < Calpha.length; i++) {
            input = input.replaceAll(Calpha[i],"0");
        }
        System.out.println(input.length());
    }
}
