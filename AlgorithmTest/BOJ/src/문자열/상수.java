package 문자열;

import java.util.Scanner;

public class 상수 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        n1 = func1(n1);
//        n2 = func1(n2);
//        if (n1 > n2) {
//            System.out.println(n1);
//        } else
//            System.out.println(n2);
//
//    }
//
//    public static int func1(int n) {
//        int res = 0;
//        int flag = 1;
//        while (n > 0) {
//            res += (n % 10);
//            res *= 10;
//            flag *= 10;
//            n /= 10;
//        }
//
//        res /= 10;
//        return res;
//    }

    //다른 풀이

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        s1 = new StringBuffer(s1).reverse().toString(); //문자열을 뒤집을 떄 사용한다.
        s2 = new StringBuffer(s2).reverse().toString();
        if (Integer.parseInt(s1) > Integer.parseInt(s2))
            System.out.println(s1);
        else
            System.out.println(s2);

    }

}
