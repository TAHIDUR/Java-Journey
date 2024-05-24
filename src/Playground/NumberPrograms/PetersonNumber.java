package Playground.NumberPrograms;

import Playground.Basics.Factorial;
import static Utilities.Helper.*;

public class PetersonNumber {
    public static void main(String[] args){
        print("Enter a number: ");
        int num = ScanInteger();
        if (isPeterson(num)) {
            println(num + " is an Peterson Number");
        } else {
            println(num + " is not an Peterson Number");
        }
    }

    private static boolean isPeterson(int num) {
        int temp = num;
        int factorialSum = 0;
        while(num > 0){
            int remainder = num % 10;
            factorialSum += Factorial.factorialWithLoop(remainder);
            num = num / 10;
        }
        return (temp == factorialSum);
    }
}
