package MultiThreading.semaphore;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;
import MultiThreading.OrderNumber;

public class SemOrderNumber implements Callable<Integer> {
    Semaphore sem;

    public SemOrderNumber(Semaphore sem) {
        this.sem = sem;
    }

    public Integer call() {
        try {
            sem.acquire();
            return OrderNumber.getOrderNumber();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            sem.release();
        }
    }
}
