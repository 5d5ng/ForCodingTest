package BigO;

public class Ex14 {
    public static void main(String[] args) {

    }
    void allFib(int n){
        for (int i=0;i<n;i++){
            System.out.println(i+": "+fib(i));//for 문을 돌때마다 i 가 다르기 때문에 호출횟수가 다르다. p80
        }
    }
    int fib(int n){
        if(n<=0) return 0;
        else if(n==1) return 1;
        return fib(n-1)+fib(n-2);

    }
}
