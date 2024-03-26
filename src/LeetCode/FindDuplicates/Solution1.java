package LeetCode.FindDuplicates;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(new Solution1().findDuplicates(nums));
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        final int[] count = new int[nums.length+1];
        for(int i: nums) count[i]++;
        for (int i=0; i < count.length; i++){
            if(count[i]==2){
                list.add(i);
            }
        }
        return list;
    }
}
