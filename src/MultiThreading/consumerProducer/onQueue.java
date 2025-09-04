package MultiThreading.consumerProducer;

public class onQueue {
    public boolean hasProduct = true;

    public synchronized void consumer() throws InterruptedException {
        System.out.println("Consumer started");
        if (hasProduct) {
            Thread.sleep(200);
            hasProduct = false;
            System.out.println("Consumer consumed");
        } else {
            System.out.println("nothing to consume");
        }
    }

    public synchronized void produce() throws InterruptedException {
        System.out.println("Producer started");
        if (!hasProduct) {
            Thread.sleep(200);
            hasProduct = true;
            System.out.println("Producer produced");
        } else {
            System.out.println("Producer already produced");
        }
    }

    public synchronized void productStatus() {
        System.out.println("product status: " + hasProduct);
    }
}
