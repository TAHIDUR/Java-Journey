package Playground.Basics;

import Utilities.Helper;

public class Palindrome {
    public static int palindromeCheck = 0;

    public static void main(String[] args) {
        palindromeCheck = Helper.ScanInteger();
        if (isPalindrome(palindromeCheck)) {
            Helper.print(palindromeCheck + " is palindrome");
        } else {
            Helper.print(palindromeCheck + " is not a palindrome");
        }
    }

    private static boolean isPalindrome(int num) {
        int temp, reminder, reversed = 0;
        temp = num;
        while (num > 0) {
            reminder = num % 10;
            num /= 10;
            reversed = (reversed * 10) + reminder;
        }
        return temp == reversed;
    }
}
