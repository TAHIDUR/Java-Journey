package LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int target = 6;
        Arrays.stream(twoSum(nums, target)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }
}
