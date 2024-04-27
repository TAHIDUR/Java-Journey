package Playground.Basics;

import java.util.Random;

import static Utilities.Helper.ScanInteger;
import static Utilities.Helper.print;

public class RandomNumber {
    public static void main(String[] args) {
        // Using Math
        print("-----Random Integer Generate------");
        Random random = new Random();
        // For Specific Range
        print("Select min and Max Range");
        System.out.print("Min: ");
        int min = ScanInteger();
        System.out.print("Max: ");
        int max = ScanInteger();
        print(specificRange(Math.random(), min, max));
        print("Using the Random Class");
        print("without range");
        print(random.nextInt());
        System.out.printf("upper bound 1 to %d", max);
        print(random.nextInt(max));
        System.out.printf("From %d to %d ranged random integer", min, max);
        print(random.nextInt(min, max));
        print("other methods ranged double");
        print(random.nextDouble(min, max));
        print("series of integers without range");
        random.ints().limit(3).forEach(num -> System.out.print(num + " "));
        print(" ");
        System.out.printf("series of integers with range from %d to %d\n", min, max);
        random.ints(min, max).limit(5).forEach(num -> System.out.print(num + " "));
    }

    public static int specificRange(double value, int min, int max) {
        return (int) (value * (max - min + 1) + min);
    }
}
