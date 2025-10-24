package MultiThreading.OreillyMultithreadingMasterclass;

public class ThreadCreation {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("1. Current Thread: " + thread.getName());

        try {
            Thread.sleep(2000); // Thread goes in block state for 2 seconds. Remember it does not release the lock.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Calling thread using extending Thread class
        NewThread newThread = new NewThread();


        // Creating thread using Runnable interface - using anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Thread currentThread = Thread.currentThread();
                currentThread.setPriority(Thread.MIN_PRIORITY);
                System.out.println("3. Current Thread: " + currentThread.getName() + " priority: " + currentThread.getPriority() + " state: " + currentThread.getState());
            }
        };

        Thread runnableThread = new Thread(runnable);
        runnableThread.setName("Runnable Thread");

        // Creating thread using Runnable interface - lambda expression
        Runnable anotherRunnable = () -> {
            Thread currentThread = Thread.currentThread();
            currentThread.setPriority(Thread.MAX_PRIORITY);
            currentThread.setName("Anonymous Runnable Thread");
            System.out.println("4. Current Thread from lambda: " + currentThread.getName() + " priority: " + currentThread.getPriority());
        };
        Thread anonymousRunnableThread = new Thread(anotherRunnable);


        newThread.start(); // calling .run() will not start in new thread it will invoke the method just like normal method call and will run in Main thread
        runnableThread.start();
        anonymousRunnableThread.start();
        try {
            anonymousRunnableThread.join(); // Main thread will stop this point to join other thread
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread finished");
    }

    static class NewThread extends Thread {
        @Override
        public void run() {
            setName("NewThread");
            Thread currentThread = Thread.currentThread();
            System.out.println("2. Current Thread: " + currentThread.getName() + " priority: " + currentThread.getPriority());
        }
    }
}
