package Playground.Pattern.Star;

import static Utilities.Helper.*;

public class DownTrianglePattern {
    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int r = ScanInteger();
        rightTrianglePattern(r);
    }

    public static void rightTrianglePattern(int r) {
        for (int i = 1; i <= r; i++) {
            int column = 2 * r - 1;
            for (int j = 1; j <= column; j++) {
                if (i == 1) print("*");
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
