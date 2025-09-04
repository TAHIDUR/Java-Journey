package FunctionalInterface;

import FunctionalInterface.Implementation.ConcreateImplementation;

// implementation a functional interface

public class Main {
    public static void main(String[] args) {

        // 1. Using a Concrete Class
        ConcreateImplementation obj = new ConcreateImplementation();
        obj.canFly("Bird");

        // 2. Using an Anonymous Inner Class
        Flayable bird = new Flayable() {
            @Override
            public void canFly(String value) {
                System.out.println(value + " Flying...");
            }
        };
        bird.canFly("Duck is");

        // 3. Implementation using a Lambda Expression
        Flayable plane = (string) -> {
            System.out.println(string + " Flying...");
        };

        plane.canFly("Plane is");
     }
}
