package Playground.Pattern.Number;

import static Utilities.Helper.*;

public class Pattern1 {
    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int r = ScanInteger();
        pattern1(r);
    }

    private static void pattern1(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                print(j + " ");
            }
            println("");
        }
    }
}
