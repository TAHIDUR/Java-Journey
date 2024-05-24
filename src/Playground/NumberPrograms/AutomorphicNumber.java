package Playground.NumberPrograms;

import static Utilities.Helper.*;

public class AutomorphicNumber {

    public static void main(String[] args) {
        print("Enter a number: ");
        int num = ScanInteger();
        if (isAutomorphic(num)) {
            println(num + " is an Automorphic number");
        } else {
            println(num + " is not an Automorphic number");
        }
    }

    private static boolean isAutomorphic(int num) {
        int square = num * num;
        int length = integerLength(num);
        int minus = square - num;
        for (int x = 0; x < length; x++) {
            if (minus % 10 != 0) return false;
        }
        return true;
    }

    private static int integerLength(int n) {
        int length = 0;
        while (n > 0) {
            n /= 10;
            length++;
        }
        return length;
    }
}
