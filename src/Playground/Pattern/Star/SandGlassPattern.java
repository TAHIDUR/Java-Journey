package Playground.Pattern.Star;

import static Playground.Pattern.Star.PyramidPattern.pyramidPattern;
import static Playground.Pattern.Star.ReversePyramidPattern.reversePyramid;
import static Utilities.Helper.*;

public class SandGlassPattern {

    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int r = ScanInteger();
        reversePyramid(r, 1);
        pyramidPattern(r);
    }
}
