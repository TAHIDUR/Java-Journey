package stream;
record R(int a, int b) {
    R {
        a = a + b;
    }
}

public class example {
    public static void main(String[] args) {
        R r = new R(2,3);
        System.out.println(r.a() + "," + r.b());

    }
}
