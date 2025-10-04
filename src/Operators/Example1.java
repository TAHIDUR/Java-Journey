package Operators;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Parent {
    int x = 10;
}

class Child extends Parent {
    int y = 20;
}

public class Example1 {
    public static void main (String[] args) throws Exception {
//        Child c = new Child();
//        Parent p = c;   // Upcasting
//
//        System.out.println(p.x); // ✅ accessible
////         System.out.println(p.y); // ❌ compile error (sliced off)
//
//
//        try {
//            throw new RuntimeException("test");
//        } finally {
//            System.out.println("Finally");
//        }
//        try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
//            throw new IOException("try");
//        } catch (IOException e) {
//            System.out.println("Catch");
//        }

        try {
            throw new Exception("Try");
        } catch (Exception e) {
            throw new RuntimeException("Catch");
//            return;
        } finally {
            int a;
//            throw new NullPointerException("Finally");
            System.out.println("finally");
            return;
        }


    }
}
