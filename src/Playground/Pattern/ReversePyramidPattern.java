package Playground.Pattern;

import static Utilities.Helper.*;
public class ReversePyramidPattern {
    public static void main(String[] args) {
        int r = 8;
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
