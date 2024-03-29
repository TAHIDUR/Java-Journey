package LeetCode.FindDuplicate;

// linear runtime complexity
// Runtime 34ms
// Memory 58.4MB
class Solution3 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(new Solution3().findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        boolean[] taken = new boolean[nums.length];
        for (int num : nums) {
            if (taken[num]) {
                return num;
            }
            taken[num] = true;
        }
        return 0;
    }
}
