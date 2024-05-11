package Playground.Pattern.Star;

import static Utilities.Helper.*;

public class ReversePyramidPattern {
    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int r = ScanInteger();
        reversePyramid(r, 1);
    }

    static void reversePyramid(int r, int loop) {
        for (int i = loop; i < (r + 1); i++) {
            for (int j = r; j >= 1; j--) {
                if ((i + j) <= (r + 1)) print("* ");
                else print(" ");
            }
            if (i != r + 1) println("");
        }
    }
}
