package MultiThreading.consumerProducer;

public class Main {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();


        Thread producer = new Thread(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            try {
                pc.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer = new Thread(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            try {
                pc.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread product = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    System.out.println("Thread Name: " + Thread.currentThread().getName());
                    pc.productStatus();
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        System.out.println("Thread Name: " + Thread.currentThread().getName());
        product.start();
        producer.start();
        consumer.start();
    }
}
