package MultiThreading.reentranceLock;

import java.util.concurrent.ExecutionException;

public class SyncronizedImplementation {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        SyncronizedImplementation syncronizedLimitations = new SyncronizedImplementation();
        Producer producer = syncronizedLimitations.new Producer();

        Thread producer1 = new Thread(() -> {
            try {
                producer.produce(); // using producer object
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread producer2 = new Thread(() -> {
            try {
                producer.produce();  // using same producer object
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        producer1.start();
        producer2.start();

//        so object level monitor lock worked  using only synchronized



    }

    public class Producer {
            public synchronized void produce() throws InterruptedException {
            System.out.println("Producer start for: " + Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("Producer end for: " + Thread.currentThread().getName());
        }
    }
}



