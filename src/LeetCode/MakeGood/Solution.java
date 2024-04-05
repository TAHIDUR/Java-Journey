package LeetCode.MakeGood;

class Solution {
    public int k;
    public static void main(String[] args) {
//        String s = "leEeetcode";
        String s = "abBAcC";
        System.out.println(new Solution().makeGood(s));
    }
    public String makeGood(String s) {
        int step = 1;
        StringBuilder result1 = new StringBuilder(s);
        return makesGood(result1, step);
    }
    public String makesGood(StringBuilder s, int step) {
        k = step;
        if(k == s.length())
        {
            return String.valueOf(s);
        }

        for(int i=0; i<s.length()-1; i++){
            char current = s.charAt(i);
            char next = s.charAt(i+1);
            if(Character.isLowerCase(current) && Character.isUpperCase(next) && (current == Character.toLowerCase(next)))
            {
                s.delete(i, i+2);
                makesGood(s, i);
            } else if (Character.isUpperCase(current) && Character.isLowerCase(next) && (current == Character.toUpperCase(next))) {
                s.delete(i, i+2);
                makesGood(s, i);
            }
        }
        return String.valueOf(s);
    }
}