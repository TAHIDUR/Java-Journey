package LeetCode.FindDuplicates;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
//        System.out.println(Math.abs(nums[1]));
        System.out.println(new Solution2().findDuplicates(nums));
    }
    private List<Integer> res;
    public List<Integer> findDuplicates(int[] nums) {
        return new AbstractList<Integer>() {
            public Integer get(int index) {
                init();
                return res.get(index);
            }
            public int size() {
                init();
                return res.size();
            }
            private void init() {
                if(res != null) return;
                res = new ArrayList<>();
                int t;
                for(int i=0; i<nums.length; i++) {
                    t = Math.abs(nums[i]);
                    System.out.print(nums[t-1]);
                    System.out.println(t);
                    if(nums[t-1] < 0) {
                        res.add(t);
                    } else {
                        nums[t-1] *= -1;
                    }
                }
            }
        };
    }
}