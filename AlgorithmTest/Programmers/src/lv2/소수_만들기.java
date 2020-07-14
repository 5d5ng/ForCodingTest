package lv2;


public class 소수_만들기 {

    public static void main(String[] args) {

    }
    public static int solution(int[] num){
        int size = num.length;
        int ans = 0;
        for (int i = 0; i < size-2; i++) {
            for (int j = i+1; j < size-1 ; j++) {
                for (int k = j+1; k < size; k++) {
                    int t = num[i]+num[j]+num[k];
                    if(isPrime(t)){
                        ans++;
                    }
                }
            }
        }
        return ans;

    }
    public static boolean isPrime(int number){
        for (int i = 3; i < number ; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}

