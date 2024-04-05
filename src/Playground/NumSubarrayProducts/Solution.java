package Playground.NumSubarrayProducts;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int result = findSubarrays(nums, k);
        System.out.println(result);
    }

    public static int findSubarrays(int[] nums, int k) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            List<Integer> subarray = new ArrayList<>();
            for (int j = i; j < nums.length; j++) {
                sum *= nums[j];
                subarray.add(nums[j]);
                if(sum < k) {
                    result++;
                }
            }
        }

        return result;
    }
}