package test;

import java.util.*;

public class Pro3 {
    static int[] ar ;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int[] list = new int[n];
        Arrays.fill(list,-1);
        fun(0,k-1,list);
        System.out.println(min);
    }



    static void fun(int depth, int size, int[] num) {
        if (size == 0) {
            int target = 0;
            int flag = 0;
            for (int i = 1; i < num.length; i++) { // 0부터 짜르면 어차피 ar[0]-ar[0] 이라 굳이 안더해줘도 됨
                if(num[i]==1){
                    System.out.print(i+" ");
                    target+=(ar[i-1]-ar[flag]);
                    flag = i;
                }
            }
            if(flag==-1){
                target = ar[ar.length-1]-ar[0];
            }
            else {
                target += ar[ar.length - 1] - ar[flag];
            }
            min = Math.min(target,min);
            System.out.println();
            return;
        }
        if (depth == num.length) {

            return;
        }

        fun(depth + 1, size , num); // num[depth]숫자를 뽑지않은 경우
        num[depth] = 1;
        fun(depth + 1, size -1, num);
        num[depth] = -1;
    }
}
