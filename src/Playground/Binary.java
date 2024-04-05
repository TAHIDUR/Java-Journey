package Playground;

import java.util.stream.IntStream;

public class Binary {
    public static void main(String[] args){
        int decimal = -1;
        System.out.println(Integer.toBinaryString(decimal));
        int[] nums = IntStream.range(-10, 0).toArray();

        for(int i: nums){
            System.out.print(" Decimal:  " + i + " Binary: ");
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
