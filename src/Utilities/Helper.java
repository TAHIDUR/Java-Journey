package Utilities;

import java.util.Scanner;

public class Helper {
    public static int ScanInteger() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String ScanString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static <T> void print(T info) {
        System.out.print(info);
    }
    public static <T> void println(T info) {
        System.out.println(info);
    }

    public static int intLength(int num) {
        int length = 0;
        while (num > 0) {
            num = num / 10;
            length++;
        }
        return length;
    }

    public static int seriesSum(int n) {
        if(n == 1) return 1;
        return n + seriesSum(n - 1);
    }
}
