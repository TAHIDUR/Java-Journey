package MultiThreading.reentranceLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.ReentrantLock;

public class BasicReentranceLock {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        BasicReentranceLock basicReentranceLock = new BasicReentranceLock();
        BasicReentranceLock.Producer producer = basicReentranceLock.new Producer();
        BasicReentranceLock.Producer anotherProducer = basicReentranceLock.new Producer();
        ReentrantLock reentrantLock = new ReentrantLock();

        Thread producer1 = new Thread(() -> {
            producer.produce(reentrantLock); // using producer object with reentrantLock
        });

        Thread producer2 = new Thread(() -> {
            anotherProducer.produce(reentrantLock);  // using new anotherProducer object with reentrantLock
        });

        producer1.start();
        producer2.start();

    }

    public class Producer {
        public synchronized void produce(ReentrantLock lock) {
            lock.lock();
            try {
                System.out.println("Producer start for: " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("Producer end for: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
