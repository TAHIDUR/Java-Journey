package MultiThreading.OreillyMultithreadingMasterclass;

public class ThreadCreation {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("1. Current Thread: "+ thread.getName());

        try {
            Thread.sleep(2000); // Thread goes in block state for 2 seconds. Remember it does not release the lock.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Calling thread using extending Thread class
        NewThread newThread = new NewThread();
        newThread.start(); // calling .run() will not start in new thread it will invoke the method just like normal method call and will run in Main thread
        System.out.println("3. Current Thread: "+ thread.getName());

        System.out.println("Thread finished");


    }

    static class NewThread extends Thread {
        @Override
        public void run() {
            setName("NewThread");
            System.out.println("2. Current Thread: "+ Thread.currentThread().getName());
        }
    }
}
