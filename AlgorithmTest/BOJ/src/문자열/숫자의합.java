package 문자열;

import java.util.Scanner;

public class 숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String input = sc.next();
        int res = 0;
        for (int i = 0; i < input.length() ; i++) {
            res+= Integer.parseInt(input.substring(i,i+1));
        }
        System.out.println(res);
    }

    //배운것 :substring 은 startindex 까지 포함하여  endindex를 포함하지 않고 자른다.

}
