package MultiThreading.ThreadPoolExecutor;

import java.util.concurrent.*;
import java.util.*;

public class CFCoreExamples {
    static String callService(String name) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException ignored) {
        }
        return "SVC_" + name;
    }

    public static void main(String[] args) {
        ExecutorService ioPool = Executors.newFixedThreadPool(8);
        try {
            // supplyAsync / runAsync
            CompletableFuture<String> f1 =
                    CompletableFuture.supplyAsync(() -> "Hello", ioPool);

            // thenApply vs thenApplyAsync
            CompletableFuture<String> f2 =
                    f1.thenApply(s -> s + " Java")               // same thread as completion
                            .thenApplyAsync(s -> s + " World!");       // async, common pool if no executor

            // thenCompose (dependent async)
            CompletableFuture<String> user =
                    CompletableFuture.supplyAsync(() -> "user123", ioPool);
            CompletableFuture<String> order =
                    user.thenCompose(uid ->
                            CompletableFuture.supplyAsync(() -> "Order for " + uid, ioPool));

            // thenCombine (independent async)
            CompletableFuture<Integer> credit = CompletableFuture.supplyAsync(() -> 750, ioPool);
            CompletableFuture<Double> balance = CompletableFuture.supplyAsync(() -> 150_000d, ioPool);
            CompletableFuture<String> decision =
                    credit.thenCombine(balance, (cr, bal) -> "Approved? " + (cr > 700 && bal > 100000));

            System.out.println(f2.join());
            System.out.println(order.join());
            System.out.println(decision.join());
        } finally {
            ioPool.shutdown();
        }
    }
}

