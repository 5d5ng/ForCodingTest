package BigO.Pro;

public class P5 { //: O(logN)
    public static void main(String[] args) {
        P5 app = new P5();
        System.out.println(app.sqrt(5));
    }
     int sqrt(int n){
         return sqrt_helper(n,1,n);
     }
     int sqrt_helper(int n, int min, int max) {
         if(max<min) return -1; //제곱근이 없는 경우 즉 제곱근이 정수가 아닌 경
         int guess = (min+max)/2;  //2로 나눈다
         if(guess*guess == n){
             return guess;
         }else if(guess*guess <n){//원하는 값 보다 작다
             return sqrt_helper(n,guess+1,max); //더 큰값 시도
         }else{
             return sqrt_helper(n,min,guess-1); //더 작은 값 시
         }

    }
}
