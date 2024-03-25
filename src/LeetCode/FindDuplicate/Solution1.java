package LeetCode.FindDuplicate;

import java.util.HashSet;

// linear runtime complexity
// Runtime 16ms
// Memory 55.5MB
class Solution1 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(new Solution1().findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        HashSet<Integer> elements = new HashSet<>();
        for(int i = 0; i< nums.length; i++){
            if(!elements.add(nums[i])){
                return nums[i];
            }
        }
        return 1;
    }
}
