package 수학;

import java.util.Scanner;

public class 달팽이는올라가고싶다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextLong();
        double b = sc.nextLong();
        double v = sc.nextLong();
        if(v==a) System.out.println(1);
        else {
            long day = (long) Math.ceil((v-a)/(a-b)) +1 ;
            System.out.println(day);
        }

    }

}
