package MultiThreading.completableFuturePlayground;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CombiningCompletableFutures {
    public static void main(String[] args) {
        FirstTest firstTest = new FirstTest();
        firstTest.thenAcceptTest();

        ThenCombineAsyncTest thenCombineAsyncTest = new ThenCombineAsyncTest();
        thenCombineAsyncTest.secondTestMethod();

        ThenAsyncClass thenAsyncClass = new ThenAsyncClass();
        thenAsyncClass.AsyncTest();
    }

    static class FirstTest {
        public void thenAcceptTest() {
            CompletableFuture<String> stringOne = CompletableFuture.supplyAsync(() -> {
                System.out.println(Thread.currentThread().getName());
                return "Hello ";
            });
            CompletableFuture<String> stringTwo = CompletableFuture.supplyAsync(() -> {
                System.out.println(Thread.currentThread().getName());
                return "World ";
            });

            CompletableFuture<String> combinedString = stringOne.thenCombine(stringTwo, (s1, s2) -> {
                System.out.println(Thread.currentThread().getName());
                return s1 + " " + s2;
            });

            combinedString.thenAccept(System.out::println);
        }
    }

    static class ThenCombineAsyncTest {
        public void secondTestMethod() {
            CompletableFuture<String> stringOne = CompletableFuture.supplyAsync(() -> {
                System.out.println(Thread.currentThread().getName());
                return "New ";
            });
            CompletableFuture<String> stringTwo = CompletableFuture.supplyAsync(() -> {
                System.out.println(Thread.currentThread().getName());
                return "Era";
            });

            CompletableFuture<String> combinedString = stringOne.thenCombineAsync(stringTwo, (s1, s2) -> {
                System.out.println(Thread.currentThread().getName());
                return s1 + " " + s2;
            });

            combinedString.thenAccept(System.out::println);
        }
    }

    static class ThenAsyncClass {
        public void AsyncTest() {
            List<CompletableFuture<String>> allFutures = Arrays.asList(
                    CompletableFuture.supplyAsync(() -> "test 1"),
                    CompletableFuture.supplyAsync(() -> "test 2"),
                    CompletableFuture.supplyAsync(() -> "test 3")
            );

            CompletableFuture<Void> combineAll = CompletableFuture.allOf(allFutures.toArray(new CompletableFuture[0]));

            combineAll.thenRun(() -> {
                allFutures.forEach(future -> {
                    try {
                        System.out.println(future.get());
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                });
            });
        }
    }

}
