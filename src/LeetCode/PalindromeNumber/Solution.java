package LeetCode.PalindromeNumber;

import Utilities.Helper;

public class Solution {
    public static int palindromeCheck = 0;
    public static void main(String[] args) {
        palindromeCheck = Helper.ScanInteger();
        if (isPalindrome(palindromeCheck)) {
            Helper.print(palindromeCheck + " is palindrome");
        } else {
            Helper.print(palindromeCheck + " is not a palindrome");
        }
    }
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int r = 0;
        while (x > r) {
            r = r * 10 + x % 10;
            x = x / 10;
        }
        return r == x || r / 10 == x;
    }
}
