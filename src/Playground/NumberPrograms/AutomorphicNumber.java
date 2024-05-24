package Playground.NumberPrograms;

import Utilities.Helper;

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
        int length = Helper.integerLength(num);
        int minus = square - num;
        for (int x = 0; x < length; x++) {
            if (minus % 10 != 0) return false;
        }
        return true;
    }
}
