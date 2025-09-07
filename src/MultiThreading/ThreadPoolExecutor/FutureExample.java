package MultiThreading.ThreadPoolExecutor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

// Example 1: Basic Callable that returns a value
        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 42; // Return a result
        };
        Future<Integer> future = executor.submit(task);

// Example 2: Using a Runnable with a pre-defined result
// The second argument is the result to return upon completion.
        Future<List<Integer>> futureWithResult = executor.submit(() -> {
            list.add(4);
            System.out.println("Task with predefined result executed");
        }, list); // This list is the result

// Example 3:
        Future<List<Integer>> futureCallable = executor.submit(() -> {
            System.out.println("Task with Callable");
            List<Integer> listObj = new ArrayList<>();
            listObj.add(100);
            return listObj; // We return the result directly
        });

        try {
            Integer result = future.get(); // result will be 42
            System.out.println(result);
            List<Integer> futureResult = futureWithResult.get();
            System.out.println(futureResult);
            List<Integer> resultList = futureCallable.get(); // resultList will be [100]
            System.out.println(resultList);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
    }
}
