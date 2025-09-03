package MultiThreading.consumerProducer;

public class Consumer implements Runnable {
    @Override
    public void run() {
        System.out.println("Consumer consumed");
    }
}
