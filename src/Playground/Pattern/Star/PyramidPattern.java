package Playground.Pattern.Star;

import static Utilities.Helper.*;

public class PyramidPattern {
    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int r = ScanInteger();
        pyramidPattern(r);
    }

    public static void pyramidPattern(int r) {
        for (int i = 1; i < r + 1; i++) {
            for (int j = 1; j < r + 1; j++) {
                if ((i + j) >= r + 1) {
                    print("* ");
                } else {
                    print(" ");
                }
            }
            if (i != r + 1) println("");
        }
    }
}
