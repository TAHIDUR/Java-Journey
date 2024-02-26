package MultiThreading.semaphore;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public class OrderNumber implements Callable<Integer> {
    private static int orderNumber;

    public Integer getOrderNumber() {
        return orderNumber++;
    }

    public Integer call() {
        Semaphore mutex = new Semaphore(1);
        try {
            mutex.acquire();
            return getOrderNumber();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            mutex.release();
        }
    }
}
