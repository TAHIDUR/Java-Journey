package MultiThreading.reentranceLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OrderNumber implements Callable<Integer> {
    private static int orderNumber;

    public Integer getOrderNumber() {
        return orderNumber++;
    }

    public Integer call() {
        Lock mutex = new ReentrantLock();
        try {
            mutex.lock();
            return getOrderNumber();
        } finally {
            mutex.unlock();
        }
    }
}
