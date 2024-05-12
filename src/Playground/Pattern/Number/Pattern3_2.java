package Playground.Pattern.Number;

import static Utilities.Helper.*;

public class Pattern3_2 {

    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int r = ScanInteger();
        pattern(r);
    }

    private static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
