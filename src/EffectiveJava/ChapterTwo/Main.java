package EffectiveJava.ChapterTwo;

import Utilities.Helper;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean available = true;
        Helper.checkType(available);
        // One advantage of static factory methods is that, unlike constructors, they have names.
        Boolean isAvailable = PrimitiveToObject.valueOf(available);
        System.out.println(isAvailable.getClass().getSimpleName());

        // A second advantage of static factory methods is that, unlike constructors, they are not required to create a new object each time they’re invoked
        Boolean alsoAvailable = PrimitiveToObject.valueOf(available);

        // PrimitiveToObject.valueOf is immutable
        System.out.println(isAvailable == alsoAvailable);
    }
}
