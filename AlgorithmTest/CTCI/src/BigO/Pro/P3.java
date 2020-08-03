package BigO.Pro;

public class P3 {

    //a%b O(1)
    int mod(int a,int b){
        if(b<=0){
            return -1;
        }
        int div = a/b;
        return a - div*b;
    }
}
