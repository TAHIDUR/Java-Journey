package MultiThreading.consumerProducer;

public class onQueueMain {
    public static void main(String[] args) {
        onQueue pc = new onQueue();


        Thread producer = new Thread(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            try {
                for (int i = 0; i < 10; i++) {
                    pc.produce();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer = new Thread(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            try {
                for (int i = 0; i < 10; i++) {
                    pc.consumer();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("Thread Name: " + Thread.currentThread().getName());
        producer.start();
        consumer.start();
    }
}
