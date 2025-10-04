package encapsulation.package1;

public class base {
    protected int value;

    public static void method() {
        base b = new base();
        System.out.println(b.value);
    }
}
