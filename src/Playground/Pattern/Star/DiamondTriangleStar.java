package Playground.Pattern.Star;

import static Utilities.Helper.*;

public class DiamondTriangleStar {
    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int rows = ScanInteger();
        for(int i=rows;i>0;i--){
            for(int j=rows;j>0;j--){
                if(i <= rows - j){
                    print(" ");
                }else {
                    print("* ");
                }
            }
            println(" ");
        }
    }
}
