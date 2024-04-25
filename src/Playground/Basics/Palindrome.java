package Playground.Basics;

import Utilities.Helper;

public class Palindrome {
    public static int palindromeCheck = 0;

    public static void main(String[] args) {
        Helper.print("----------Palindrome Check----------");
        Helper.print("1 For Integer");
        Helper.print("2 For String");

        int option = Helper.ScanInteger();
        if(option == 1) {
            palindromeCheck = Helper.ScanInteger();
            if (isPalindrome(palindromeCheck)) {
                Helper.print(palindromeCheck + " is palindrome");
            } else {
                Helper.print(palindromeCheck + " is not a palindrome");
            }
        }else if(option==2){
            String stringPalindromeCheck = Helper.ScanString();
            if (isPalindrome(stringPalindromeCheck)) {
                Helper.print(stringPalindromeCheck + " is palindrome");
            } else {
                Helper.print(stringPalindromeCheck + " is not a palindrome");
            }
        }else{
            Helper.print("Invalid Input");
            Helper.print("-------------Terminating-------------");
            return;
        }
    }

    private static <T> boolean isPalindrome(T num) {
        // check type of generics
        int temp, reminder, reversed = 0;
        if (num instanceof Integer n) {
            temp = n;
            while (n > 0) {
                reminder = n % 10;
                n /= 10;
                reversed = (reversed * 10) + reminder;
            }
            return temp == reversed;
        }
        if(num instanceof String c){
            final int len = c.length();
            for(int i=0;i<len;i++){
                if(c.charAt(i) != c.charAt(len-i-1)) return false;
            }
            return true;
        }
        return false;
    }
}
