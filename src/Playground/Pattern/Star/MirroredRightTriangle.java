package Playground.Pattern.Star;

import static Utilities.Helper.*;

public class MirroredRightTriangle {
    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int rows = ScanInteger();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if ((j + i) > rows) {
                    print("*");
                } else {
                    print(" ");
                }
            }
            println("");
        }
    }
}
