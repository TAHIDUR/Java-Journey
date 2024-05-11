package Playground.Pattern.Star;

import static Utilities.Helper.*;

public class DiamondStarPattern {
    public static void main(String[] args) {
//        print("Enter the number of raw: ");
//        int r = ScanInteger();
        int r = 5;
        diamondStarPattern(r);
    }

    private static void diamondStarPattern(int r) {
        for (int i = 1; i <= r - 1; i++) {
            int column = 2 * r - 1;
            for (int j = 1; j <= column; j++) {
                if (i == 1)
                    if (j == r) print("*");
                    else print(" ");
                else {
                    if (j == r + i - 1 || j == r - i + 1) print("*");
                    else print(" ");
                }
            }
            println("");
        }
        for (int i = 1; i <= r; i++) {
            int column = 2 * r - 1;
            for (int j = 1; j <= column; j++) {
                if (i == 1) {
                    if (j == 1 || j == column) print("*");
                    else print(" ");
                }
                else if (i == r) {
                    if (j == r) print("*");
                    else print(" ");
                } else {
                    if (j == i || j == column - i + 1) print("*");
                    else print(" ");
                }
            }
            println("");
        }
    }

}
