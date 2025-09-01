package Playground;

import java.math.BigDecimal;

public class Operators {
    public static void main(String[] args) {
        double number = 5.6;
        System.out.println(number / 0); // Infinity

        double number1 = -5.6;
        System.out.println(number1 / 0); // -Infinity

//
//        double number2 = (0.0 / 0.0);
//        System.out.println(number2);

        try {
            int num = 5;
            System.out.println(num / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MAX_VALUE + 2);
        System.out.println(Integer.MAX_VALUE + 3);


        double d1 = 0.1 + 0.2;
        double d2 = 0.3;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1 == d2);

        BigDecimal d3 = new BigDecimal("0.3");
        BigDecimal d4 = BigDecimal.valueOf(0.3);
        System.out.println(d3.equals(d4));
    }
}
