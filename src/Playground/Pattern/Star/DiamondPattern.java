package Playground.Pattern.Star;

import static Playground.Pattern.Star.ReversePyramidPattern.reversePyramid;
import static Utilities.Helper.*;

public class DiamondPattern {
    public static void main(String[] args) {
        print("Enter the number of raw for diamond start: ");
        int r = ScanInteger();
        for(int i = 1;i < r;i ++){
            for(int j = 1;j < r;j ++) {
                if((i + j) >= r) {
                    print("* ");
                }else{
                    print(" ");
                }
            }
            println("");
        }
        reversePyramid(r);
    }
}
