package Playground.Pattern.Star;

import static Utilities.Helper.*;

public class RightDownMirror {
    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int rows = ScanInteger();
        rightDownMirror(rows, 1);
    }

    public static void rightDownMirror(int rows, int loop) {
        for (int i = loop; i < rows + 1; i++) {
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
