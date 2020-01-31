package 재귀;

import java.util.Scanner;

public class 피보나치수5 {

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int n =sc .nextInt();

        System.out.println(f(n));

    }

    public static int f(int n){
        if(n==0) return 0;
        else if( n ==1 )return  1;

        return  f(n-1) +f(n-2);
    }


}
