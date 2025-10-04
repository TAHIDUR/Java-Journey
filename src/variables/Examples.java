package variables;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Examples {
    public static void main(String[] args) {
        short s1 = 1000;
        short s2 = 2000;
//        short s3 = s1 + s2; Will cause error for Type Promotion Rules


        byte b1 = 10;
        short s4 = b1;
        int i1 = b1;
        long l1 = b1;
        char c1 = 'E';
        boolean result;
        float f1 = 234.5f;
        double d1 = 234.5;

        char isNull = '\u0000';
        int nullInt = (int) isNull;
        char check = (char) nullInt;
//        Character checkNull = isNull;
//        Stream.of(isNull).peek((ch) -> System.out.println((int) ch)).count();
//        result = Objects.equals(isNull, checkNull);
//        System.out.println(checkNull);
        System.out.println(nullInt);
        System.out.println(check);
    }
}
