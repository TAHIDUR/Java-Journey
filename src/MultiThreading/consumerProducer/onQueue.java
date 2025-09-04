package MultiThreading.consumerProducer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class onQueue {
    public BlockingQueue<Integer> product = new ArrayBlockingQueue<Integer>(3);

    public synchronized void consumer() throws InterruptedException {
        System.out.println("Consumer started");
        while (product.isEmpty()) {
            System.out.println("nothing to consume waiting for producer");
            wait();
        }

        product.take();
        System.out.println("Consumer consumed: " + product);
        notifyAll();
    }

    public synchronized void produce() throws InterruptedException {
        System.out.println("Producer started");
        while (product.size() == 3) {
            System.out.println("Buffer full waiting for consumer: " + product);
            wait();
        }

        product.add(1);
        System.out.println("Producer produced: " + product);
        notifyAll();

    }
}
