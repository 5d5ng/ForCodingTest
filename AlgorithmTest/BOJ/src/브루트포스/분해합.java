package 브루트포스;

import java.util.Scanner;

public class 분해합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n ; i++) {
            if (fun(i)+i == n) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);

    }
    public static int fun(int n){
        int res = 0;
        while(n>0){
            res += n%10;
            n/=10;
        }
        return res;
    }
}
