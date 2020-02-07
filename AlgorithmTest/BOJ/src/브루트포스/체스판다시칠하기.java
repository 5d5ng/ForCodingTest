package 브루트포스;

import java.util.Scanner;

public class 체스판다시칠하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0 ,cnt2 = 0, flag = 1;
        String [] board = new String[m];
        for (int i = 0; i <n ; i++) {
                board[i] = sc.next();
        }
        for (int i = 0; i <n ; i++) {
            String str = board[i];
            for (int j = 0; j < str.length() ; j++) {
                flag*=-1;
              if(j%2 == 0){
                  if(str.charAt(j)=='B') {
                      if(flag ==1)
                      cnt++;
                      else cnt2++;
                  }
              }
              else {
                  if (str.charAt(j) == 'W') {
                      if (flag == -1) cnt++;
                      else cnt2++;
                  }
              }
            }
        }

        if(cnt==0 && cnt2 == 0) System.out.println(0);
        else if( cnt!=0){
            System.out.println(cnt2);
        }
        else if(cnt2!=0){
            System.out.println(cnt);
        }
        else{
            if(cnt>cnt2) System.out.println(cnt2);
            else System.out.println(cnt);
        }

    }
}
