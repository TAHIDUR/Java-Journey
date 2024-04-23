package Playground.Basics;

import Utilities.Helper;

public class PrimeNumber {
    public static int primeCheck;


    public static void main(String[] args) {
        primeCheck = Helper.ScanInteger();
        if (isPrime(primeCheck)) {
            Helper.print(primeCheck + " is prime");
        } else {
            Helper.print(primeCheck + " is not a prime");
        }
    }

    private static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                Helper.print(i);
                return false;
            }
        }
        return true;
    }
}
