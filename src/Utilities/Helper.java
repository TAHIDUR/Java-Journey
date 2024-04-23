package Utilities;

import java.util.Scanner;

public class Helper {
    public static int ScanInteger(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static <T> void print(T info){
        System.out.println(info);
    }
}
