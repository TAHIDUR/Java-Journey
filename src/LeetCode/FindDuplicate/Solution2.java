package LeetCode.FindDuplicate;

import java.util.Arrays;

// linear runtime complexity
// Runtime 34ms
// Memory 58.4MB
class Solution2 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(new Solution2().findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i< nums.length; i++){
            if(nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return 1;
    }
}
