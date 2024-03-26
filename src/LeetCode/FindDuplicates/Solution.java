package LeetCode.FindDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(new Solution().findDuplicates(nums));
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(temp.containsKey(nums[i]) && temp.get(nums[i]) == 1){
                list.add(nums[i]);
            }
            else{
                temp.put(nums[i], 1);
            }
        }
        return list;
    }
}
