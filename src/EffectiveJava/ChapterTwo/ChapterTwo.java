package EffectiveJava.ChapterTwo;

import java.math.BigInteger;
import java.security.SecureRandom;

public class ChapterTwo {
    public static void main(String[] args) {
        Name name = Name.getNameInstance();
        BigInteger bigInteger = BigInteger.probablePrime(21, new SecureRandom());

        System.out.println(bigInteger);
    }


}

class Name {
    private Name() {
        System.out.println("Constructor called");
    }

    public static Name getNameInstance() {
        return new Name();
    }
}