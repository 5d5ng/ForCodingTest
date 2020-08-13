package easy;

import java.util.Arrays;

public class Majority_Element {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return(nums[nums.length/2]);
    }
}
