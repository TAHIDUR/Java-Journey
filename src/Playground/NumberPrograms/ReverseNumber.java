package Playground.NumberPrograms;

import static Utilities.Helper.*;

public class ReverseNumber {
    public static void main(String[] args) {
        print("Enter a number: ");
        int n = ScanInteger();
        int reminder, reversed = 0;
        while (n > 0) {
            reminder = n % 10;
            reversed = reversed * 10 + reminder;
            n = n / 10;
        }
        System.out.printf("The reversed number is %d", reversed);
    }
}
