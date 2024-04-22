package Playground.Basics;

import Utilities.Helper;

public class PrimeNumber {
    public static int primeCheck;


    public static void main(String[] args){
        primeCheck = Helper.ScanInteger();
        Helper.printInt(primeCheck);
    }
}
