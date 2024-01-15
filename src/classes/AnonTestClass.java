package classes;

@FunctionalInterface
interface MyInterface {
    public void show();
}
public class AnonTestClass {

    public static void main(String[] args) {
        MyInterface a = () ->
        {
            System.out.println("Show from anonymous class");
        };


        a.show();
    }
}
