package MultiThreading.OreillyMultithreadingMasterclass;

public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread firstThread = new Thread(new MyThread(10), "FirstThread");
        Thread secondThread = new Thread(new MyThread(3), "SecondThread");

        firstThread.setDaemon(true);

        firstThread.start();
        secondThread.start();

//        Garbage Collection is also a deamon thread
//      Daemon thread will close when user thread closed.

//        We can prevent Daemon thread closing by using join here
//        firstThread.join();
    }

    static class MyThread extends Thread {
        private final int second;

        public MyThread(int second) {
            this.second = second;
        }

        @Override
        public void run() {
            for (int i = 0; i < second; i++) {
                try {
                    System.out.println("This thread " + Thread.currentThread().getName() + " is sleeping for 1 second");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
