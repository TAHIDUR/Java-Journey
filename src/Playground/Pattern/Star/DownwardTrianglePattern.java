package Playground.Pattern.Star;

import static Utilities.Helper.*;

public class DownwardTrianglePattern {
    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int rows = ScanInteger();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < (rows - i); j++) {
                print("* ");
            }
            println("");
        }
    }
}
