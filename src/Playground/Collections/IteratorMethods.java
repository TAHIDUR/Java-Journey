package Playground.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {

    public static void main(String[] args) {
        ArrayList<String> queue = new ArrayList<>();
        iteration(queue);
        System.out.println("-------------------------");
        forLoop(queue);
        System.out.println("-------------------------");
        forEachLoop(queue);
        System.out.println("-------------------------");
        defaultForEachRemainingMethod(queue);
    }

    public static void iteration(ArrayList<String> queue) {
        queue.add("zero");
        queue.add("one");
        queue.add("two");
        Iterator<String> iterator = queue.iterator();
        while(iterator.hasNext()){
            String val = iterator.next();
            System.out.println(val);
            if(val.equals("two")) iterator.remove();
        }
    }


    public static void forLoop(ArrayList<String> queue) {
        for (String value : queue) {
            System.out.println(value);
        }
    }

    public static void forEachLoop(ArrayList<String> queue) {
        queue.forEach(System.out::println);
    }

    private static void defaultForEachRemainingMethod(ArrayList<String> queue) {
        Iterator<String> iterator = queue.iterator();
        iterator.forEachRemaining(System.out::println);
    }
}
