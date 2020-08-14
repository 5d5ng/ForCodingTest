package easy;

public class Move_Zeroes283 {
    public void moveZeroes(int[] nums){
        int cnt = 0;
        for(int num:nums){
            if(num == 0)cnt++;
        }
        int i = 0,zcnt = 0;
        while(zcnt!=cnt){
            if(nums[i] == 0){
                int j = i;
                while(j<nums.length-1){
                    nums[j] = nums[j+1];
                    j++;
                }
                zcnt++;
                i--;
                nums[j] = 0;
            }
            i++;
        }
    }

}
