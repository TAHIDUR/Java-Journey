package LeetCode.RomanToInteger;

import Utilities.Helper;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    private static Map<Character, Integer> romanIntMap = new HashMap<>();

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
        String roman = "LVIII";
        Helper.print(romanToInt(roman));
    }

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length()-1) {
                int currentValue = getIntValue(s.charAt(i));
                int nextValue = getIntValue(s.charAt(i + 1));
                if (currentValue < nextValue) {
                    result += (nextValue - currentValue);
                    i++;
                } else {
                    result += currentValue;
                }
            } else {
                result += getIntValue(s.charAt(i));
            }
        }
        return result;
    }

    public static int getIntValue(char ch) {
        int value = 0;
        switch (ch) {
            case 'I':
                value = romanIntMap.get(ch);
                break;
            case 'V':
                value = romanIntMap.get(ch);
                break;
            case 'X':
                value = romanIntMap.get(ch);
                break;
            case 'L':
                value = romanIntMap.get(ch);
                break;
            case 'C':
                value = romanIntMap.get(ch);
                break;
            case 'D':
                value = romanIntMap.get(ch);
                break;
            case 'M':
                value = romanIntMap.get(ch);
                break;
        }
        return value;
    }
}
