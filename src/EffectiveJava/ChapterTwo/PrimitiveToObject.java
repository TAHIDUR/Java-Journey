package EffectiveJava.ChapterTwo;

public class PrimitiveToObject {
    public static Boolean valueOf(boolean bool) {
        return bool ? Boolean.TRUE : Boolean.FALSE;
    }
}
