package easy;
import java.util.*;
public class Find_All_Numbers_Disappeared_in_an_Array448 {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int [] ar = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            ar[nums[i]]++;
        }
        for(int i=1;i<ar.length;i++){
            if(ar[i]==0)list.add(i);
        }
        return list;
    }
}
