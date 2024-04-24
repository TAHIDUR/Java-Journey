package LeetCode.RomanToInteger;

import Utilities.Helper;

public class Solution2 {
    private static final char[] romanChar = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    private static final int[] romanValue = new int[]{1, 5, 10, 50, 100, 500, 1000};

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        Helper.print(romanToInt(roman));
    }

    public static int romanToInt(String s) {
        int n = s.length();
        int result = getRomanValue(s.charAt(n - 1));
        for (int i = n - 2; i > -1; i--) {
            if (getRomanValue(s.charAt(i)) < getRomanValue(s.charAt(i + 1))) {
                result -= getRomanValue(s.charAt(i));
            } else {
                result += getRomanValue(s.charAt(i));
            }
        }
        return result;
    }

    public static int getRomanValue(char ch) {
        for (int i = 0; i < romanChar.length; i++) {
            if (romanChar[i] == ch) {
                return romanValue[i];
            }
        }
        return 0;
    }
}
