package lv3;
import java.util.*;
public class 저울{
    public static void main(String[] args) {

        int[] w = {3,1,6,1,7,31};
        System.out.println(solution(w));
    }
    public static int solution(int[] weight) {
        Arrays.sort(weight);

        int ans = 1;
        for(int i=0;i<weight.length;i++){
            if(ans>=weight[i]){
                ans+=weight[i];
            }
            else break;
        }
        return ans;
    }
}
