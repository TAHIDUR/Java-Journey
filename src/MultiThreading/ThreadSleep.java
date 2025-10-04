package MultiThreading;

public class ThreadSleep {
    public static void main(String[] args){
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread started");
                Thread.sleep(5000);
                System.out.println("Thread finished");
            } catch (InterruptedException e) {
                System.out.println("The thread name: " + Thread.currentThread().getName());
            }
        });


        try {
            System.out.println("The thread name: " + Thread.currentThread().getName());
            thread.start();
            System.out.println("Thread state: " + thread.getState());
            Thread.sleep(2000);
            thread.interrupt();
            System.out.println("Thread state: " + thread.getState());
            boolean isInterrupted = thread.isInterrupted();
            System.out.println("Thread state: " + thread.getState());
            System.out.println("Is thread interrupted from main thread ? " + isInterrupted);
            System.out.println("Thread state: " + thread.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
