package Playground.Pattern.Number;

import static Utilities.Helper.*;

public class Pattern2 {
    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int r = ScanInteger();
        pattern1(r);
    }

    private static void pattern1(int r) {
        int loop = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                print(loop++ + " ");
            }
            println("");
        }
    }
}
