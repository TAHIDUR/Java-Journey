package EffectiveJava.ChapterTwo;

import Utilities.Helper;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean available = true;
        Helper.checkType(available);
        // One advantage of static factory methods is that, unlike constructors, they have names.
        Boolean isAvailable = PrimitiveToObject.valueOf(available);
        System.out.println(isAvailable.getClass().getSimpleName());

        String s = "hello"; // this immutable not changed
        s.toUpperCase(); // every time return a new instance
        System.out.println(s);
    }
}
