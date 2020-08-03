package BigO;

import com.sun.javafx.iio.common.SmoothMinifier;

public class Ex15 {
    public static void main(String[] args) {
        Ex15 app = new Ex15();
        app.allFib(10);
    }
    void allFib(int n){
        int[] memo = new int[n+1];
        for (int i = 0; i < n; i++) {
            System.out.println(i+": "+fib(i,memo));// 메모제이션을 적용하므로 O(n)
        }

    }

    int fib(int n, int[] memo) { //메모이제이션 활용

        if(n<=0) return 0;
        else if(n==1) return 1;
        else if (memo[n]> 0) return memo[n]; //이미저장되어있는 경우 그대로 사용 즉 메모제이션 적용
        memo[n] = fib(n-1, memo) +fib(n-2,memo);
        return memo[n];

    }
}
