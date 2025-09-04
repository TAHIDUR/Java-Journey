package Playground.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();

        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);

        System.out.println(collection.remove(collection)); // Never removes return false

        System.out.println(collection);

        List<Integer> list = new ArrayList<>();

        exampleCapacityRestricted();
    }

    private static void exampleCapacityRestricted() {
        Queue<Integer> queue = new ArrayBlockingQueue<>(2);
    }
}
