package BigO.Pro;

public class P2 {
    //a^b  O(b) : a를  b번 곱하는 것이므로

    int power(int a,int b){
        if(b<0){
            return 0;
        }else if(b==0){
            return 1;
        }
        else{
            return a * power(a,b-1);
        }
    }
}
