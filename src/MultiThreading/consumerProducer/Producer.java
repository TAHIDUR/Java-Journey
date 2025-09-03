package MultiThreading.consumerProducer;

public class Producer implements Runnable {
    @Override
    public void run() {
        System.out.println("Producer producing");
    }
}
