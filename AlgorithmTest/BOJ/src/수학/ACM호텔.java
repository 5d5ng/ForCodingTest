package 수학;

import java.util.Scanner;

public class ACM호텔 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int res = 0;
        for (int i = 0; i < T; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int rNum = n / h; //방번호 끝자리 rNum
            if (n % h != 0) rNum++;

            int fNum = n % h; //층번호
            if (fNum == 0) fNum = h;

            res = 100 * fNum + rNum;
            System.out.println(res);

        }

    }
}

