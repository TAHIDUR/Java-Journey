package Playground.Basics;

import Utilities.Helper;

public class Factorial {
    public static void main(String[] args) {
        Helper.print("Enter the number for Factorial");
        int factorial = Helper.ScanInteger();
        Helper.print("1 Using Loop");
        Helper.print("2 Using Recursion");
        int option = Helper.ScanInteger();

        if (option == 1) {
            Helper.print("Factorial of " + factorial + " is " + factorialWithLoop(factorial));
        } else if (option == 2) {
            Helper.print("Factorial of " + factorial + " is " + factorialWithRecursion(factorial));
        } else {
            Helper.print("Invalid Input");
        }
    }

    private static int factorialWithLoop(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    private static int factorialWithRecursion(int n) {
        if(n == 1) return 1;
        return n * factorialWithRecursion(n - 1);
    }
}
