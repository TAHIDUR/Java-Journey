package Playground.Tricky;

public class PrimitiveVariable {
    public static void main(String[] args) {
        int a = 10, b;
        if(a < 10) b = 1;
        if(a >= 10) b =2;
        //  System.out.println("b is" + b); // compile time error b is not initialized
    }
}
