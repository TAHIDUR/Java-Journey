package Operators;

public class Unary {
    public static void main(String[] args){
        int a = 10;
        int b = 10;

        System.out.println(a++);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(++b + ++b);
    }
}
