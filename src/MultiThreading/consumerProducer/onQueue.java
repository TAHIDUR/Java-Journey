package MultiThreading.consumerProducer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class onQueue {
    public BlockingQueue<Integer> product = new ArrayBlockingQueue<Integer>(3);

    public synchronized void consumer() throws InterruptedException {
        System.out.println("Consumer started");
        Thread.sleep(500);
        while (!product.isEmpty()) {
            product.take();
            System.out.println("Consumer consumed");
        }

        wait();
        System.out.println("nothing to consume");
    }

    public synchronized void produce() throws InterruptedException {
//        Thread.sleep(500);
        System.out.println("Producer started");
        while (product.isEmpty()) {
            product.add(1);
            System.out.println("Producer produced");
            notifyAll();
        }

        System.out.println("Producer already produced");
        wait();
    }
}
