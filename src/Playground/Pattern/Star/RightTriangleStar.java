package Playground.Pattern.Star;

import static Utilities.Helper.*;

public class RightTriangleStar {
    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int r = ScanInteger();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                print("* ");
            }
            println("");
        }
    }
}