package Playground.Pattern.Star;

import static Playground.Pattern.Star.MirroredRightTriangle.mirroredRightTriangle;
import static Playground.Pattern.Star.RightDownMirror.rightDownMirror;
import static Utilities.Helper.*;

public class LeftPascalTriangle {
    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int rows = ScanInteger();
        mirroredRightTriangle(rows);
        rightDownMirror(rows, 2);
    }
}
