package LeetCode.RomanToInteger;

import Utilities.Helper;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    private static final Map<Character, Integer> romanIntMap = new HashMap<>();

    static {
        romanIntMap.put('I', 1);
        romanIntMap.put('V', 5);
        romanIntMap.put('X', 10);
        romanIntMap.put('L', 50);
        romanIntMap.put('C', 100);
        romanIntMap.put('D', 500);
        romanIntMap.put('M', 1000);
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        Helper.print(romanToInt(roman));
    }

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i != s.length()-1) {
                int currentValue = romanIntMap.get(ch);
                int nextValue = romanIntMap.get(s.charAt(i+1));
                if (currentValue < nextValue) {
                    result += (nextValue - currentValue);
                    i++;
                } else {
                    result += currentValue;
                }
            } else {
                result += romanIntMap.get(ch);
            }
        }
        return result;
    }
}
