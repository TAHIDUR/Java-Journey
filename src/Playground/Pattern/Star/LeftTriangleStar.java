package Playground.Pattern.Star;

import static Utilities.Helper.ScanInteger;
import static Utilities.Helper.print;

public class LeftTriangleStar {
    public static void main(String[] args) {
        print("Enter the number of raw for left start: ");
        int rows = ScanInteger();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if((i + j) <= rows){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
