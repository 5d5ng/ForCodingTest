package 백트래킹;

import java.util.Scanner;

public class N_Queen2 {
    static int n, ans;
    static int[] col, inc , dec;

    public static void main(String[] args) {
        col = new int[10]; //열
        inc = new int[20];//증가 대각선
        dec = new int[20];//감소 대각선
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        NQueen2(1);
        System.out.println(ans);

    }
    public static void NQueen2(int num){
        if(num>n){
            ans++;
            return;
        }
        for (int i = 1; i <=n ; i++) {
            if(col[i] == 0 && inc[num+i] == 0 && dec[n+(num-i)+1] == 0){ //dec의 경우 음수방지를 위해 n을 더한다
                col[i]=inc[num+i]=dec[n+(num-i)+1] = 1;
                NQueen2(num+1);
                col[i]=inc[num+i]=dec[n+(num-i)+1] = 0;
            }

        }
    }
}
