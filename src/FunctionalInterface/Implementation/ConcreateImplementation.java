package FunctionalInterface.Implementation;

import FunctionalInterface.Flayable;

public class ConcreateImplementation implements Flayable {

    @Override
    public void canFly(String value) {
        System.out.println(value + " Flying...");
    }
}
