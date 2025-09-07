package MultiThreading;

public class ThreadJoin extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread print = new Thread(() -> {
            try {
                System.out.println("From thread: " + Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread finished: " + Thread.currentThread().getName());
        });
        print.start();
        System.out.println("From main thread started");
        Thread.sleep(2000);
        print.join(); // Main thread will stop this point to join other thread
        System.out.println("Main thread finished");
    }
}