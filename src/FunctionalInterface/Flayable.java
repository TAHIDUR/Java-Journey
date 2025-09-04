package FunctionalInterface;

@FunctionalInterface
public interface Flayable {
    void canFly(String value); // Single Abstract Method (SAM)

    // This is allowed (default method)
    default void describe() {
        System.out.println("This interface represents something that can fly.");
    }

    // This is also allowed (static method)
    static boolean isReal() {
        return true;
    }
}
