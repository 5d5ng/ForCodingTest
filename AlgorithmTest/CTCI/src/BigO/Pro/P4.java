package BigO.Pro;

public class P4 { //O(a/b) ***
    int div(int a,int b){
        int count = 0;
        int sum = b;
        while(sum<=a){
            sum+=b;
            count++;
        }
        return count;
    }
}
