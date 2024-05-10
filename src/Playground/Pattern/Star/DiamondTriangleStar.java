package Playground.Pattern.Star;

import static Utilities.Helper.ScanInteger;
import static Utilities.Helper.print;

public class DiamondTriangleStar {
    public static void main(String[] args) {
        print("Enter the number of raw for Pyramid Start: ");
        int rows = ScanInteger();
        for(int i=rows;i>0;i--){
            for(int j=rows;j>0;j--){
                if(i <= rows - j){
                    System.out.print(" ");
                }else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
