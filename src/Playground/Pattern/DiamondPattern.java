package Playground.Pattern;

import static Utilities.Helper.print;
import static Utilities.Helper.println;

public class DiamondPattern {
    public static void main(String[] args) {
        int r = 8;
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
