package Playground.Pattern.Star;

import static Utilities.Helper.*;
public class ReversePyramidPattern {
    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int r = ScanInteger();
        reversePyramid(r);
    }

    static void reversePyramid(int r) {
        for(int i = 1;i < r;i ++){
            for(int j = r;j > 1;j --) {
                if((i + j) <= r) {
                    print("* ");
                }else{
                    print(" ");
                }
            }
            println("");
        }
    }
}
