package LeetCode.FindDuplicate;

import java.util.HashMap;

// linear runtime complexity
// Runtime 21ms
// Memory 58.5MB
class Solution {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(new Solution().findDuplicate(nums));
    }
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(elements.containsKey(nums[i])){
                return nums[i];
            }
            elements.put(nums[i], i);
        }
        return 1;
    }
}
