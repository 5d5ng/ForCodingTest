package BigO;

public class Ex13 {
    public static void main(String[] args) {

    }
    int fib(int n){
        if(n<=0) return 0;
        else if(n==1) return 1;
        return fib(n-1)+fib(n-2);

    }
    //재귀호출패턴의 경우 분기의 깊이승 즉 분기^깊이
    //깊이를 n 이라고 하면 시간복잡도는 O(2^n)

}
