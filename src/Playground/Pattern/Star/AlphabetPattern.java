package Playground.Pattern.Star;

import static Utilities.Helper.*;
import static java.lang.System.exit;

public class AlphabetPattern {
    public static void main(String[] args) {
        print("Enter the number of raw more than 5: ");
        int r = ScanInteger();
        if (r > 5) alphabetPattern(r);
        else println("invalid input");
        exit(1);
    }

    public static void alphabetPattern(int r) {
        for (int i = 1; i <= r; i++) {
            int column = (r / 2) + 2;
            for (int j = 1; j <= column; j++) {
                boolean isCorner = (j == 1) || (j == column);
                if (i == 1 || i == r / 2 + 1) {
                    if (i == 1 && isCorner) print(" ");
                    else print("*");
                } else {
                    if (isCorner) print("*");
                    else print(" ");
                }
            }
            println("");
        }
    }
}
