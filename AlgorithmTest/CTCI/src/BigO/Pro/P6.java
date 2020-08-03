package BigO.Pro;

public class P6 {//: O(√N)
    public static void main(String[] args) {

    }
    int sqrt(int n){
        for (int guess = 1;guess*guess<=n;guess++){
            if(guess*guess == n) return guess;
        }
        return -1;
    }
}
