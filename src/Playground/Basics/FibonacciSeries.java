package Playground.Basics;

/**
 * Fibonacci Series Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 , ......
 */
public class FibonacciSeries {

    public static int n1 = 0;
    public static int n2 = 1;
    public static int n3;
    public static int count = 8;
    public static void main(String[] args){
        System.out.println("-------------- Without Recursion -----------------");
        withOutRecursion();
        System.out.println("\n-------------- Recursion -----------------");
        withRecursion();
    }

    private static void withOutRecursion() {
        int x1 = 0;
        int x2 = 1;
        int x3, i, times = 10;
        System.out.print(x1+ " " + x2);
        for (i = 2; i < times; i++){
            x3 = x1 + x2;
            System.out.print(" " + x3);
            x1 = x2;
            x2 = x3;
        }
    }

    private static void withRecursion() {
        System.out.print(n1+ " " + n2);
        fibonaci(count);
    }

    private static void fibonaci(int count) {
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonaci(count-1);
        }
    }
}
