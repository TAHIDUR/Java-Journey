package Playground.Basics;

import Utilities.Helper;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Helper.print("Enter the number to check Armstrong");
        int num = Helper.ScanInteger();
        Helper.print(isArmstrong(num) ? "Armstrong" : "Not Armstrong");
    }

    private static boolean isArmstrong(int num) {
        int length = Helper.intLength(num);
        int reminder, sum = 0, temp = num;
        while (num > 0) {
            reminder = num % 10;
            sum += Math.pow(reminder, length);
            num /= 10;
        }
        return temp == sum;
    }
}
