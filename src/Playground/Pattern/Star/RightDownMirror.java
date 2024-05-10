package Playground.Pattern.Star;

import static Utilities.Helper.*;

public class RightDownMirror {
    public static void main(String[] args) {
        print("Enter the number of raw for diamond start: ");
        int rows = ScanInteger();
        for (int i = 1; i < rows + 1; i++) {
            for (int j = rows; j >= 1; j--) {
                if (rows + 1 < (i + j)) {
                    print(" ");
                } else {
                    print("*");
                }
            }
            println("");
        }
    }
}
