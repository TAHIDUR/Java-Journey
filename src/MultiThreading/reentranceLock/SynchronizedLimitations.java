package MultiThreading.reentranceLock;

import java.util.concurrent.ExecutionException;

public class SynchronizedLimitations {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        SynchronizedLimitations SynchronizedLimitations = new SynchronizedLimitations();
        Producer producer = SynchronizedLimitations.new Producer();
        Producer anotherProducer = SynchronizedLimitations.new Producer();

        Thread producer1 = new Thread(() -> {
            try {
                producer.produce(); // using producer object
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread producer2 = new Thread(() -> {
            try {
                anotherProducer.produce();  // using new anotherProducer object
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        // Now monitor lock will not work as it's work on same object
        producer1.start();
        producer2.start();

        // When multiple object try to access synchronized block it allows lock not working
    }

    public class Producer {
        public synchronized void produce() throws InterruptedException {
            System.out.println("Producer start for: " + Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("Producer end for: " + Thread.currentThread().getName());
        }
    }
}



