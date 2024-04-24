package MultiThreading.semaphore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class SemaphoreExample {


    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int count = 10;
        ExecutorService executor;
        try {
            executor = Executors.newFixedThreadPool(5);

            List<Future<Integer>> futures = new ArrayList<>();

            Set<Integer> orderNumbers = new HashSet<>();

            Semaphore sem = new Semaphore(1);
            for (int i = 0; i < count; i++) {
                Callable<Integer> thread = new SemOrderNumber(sem);
                FutureTask task = new FutureTask(thread);
                futures.add(i, executor.submit(thread));
            }

            executor.shutdown();

            for (Future<Integer> future : futures) {
                Integer orderNumber = future.get();
                orderNumbers.add(orderNumber);
                System.out.println("Order number: " + orderNumber);
            }
            System.out.println("Total order numbers: " + orderNumbers.size());
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
