package LeetCode.FirstMissingPositive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(new Solution().firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for (int i=1;i<100_000;i++) {
            if(!map.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}
