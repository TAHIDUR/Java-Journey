package LeetCode.FindDuplicates;

import java.util.ArrayList;
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
        for (int num : nums) {
            if (temp.containsKey(num) && temp.get(num) == 1) {
                list.add(num);
            } else {
                temp.put(num, 1);
            }
        }
        return list;
    }
}
