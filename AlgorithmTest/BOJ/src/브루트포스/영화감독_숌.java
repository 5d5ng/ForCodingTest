package 브루트포스;

import java.util.Scanner;

public class 영화감독_숌 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0 , i = 1;
        while(cnt!=n){
            if(BadNum(i))
                cnt++;
            i++;
        }
        System.out.println(--i);
    }
    public static boolean BadNum(int n){
        String num = Integer.toString(n);
        for(int i=0 ; i<num.length()-2;i++)
        {
            if(num.charAt(i) == '6' && num.charAt(i+1) == '6' && num.charAt(i+2)  =='6'){
                return true;
            }
        }
        return false;

    }
}
