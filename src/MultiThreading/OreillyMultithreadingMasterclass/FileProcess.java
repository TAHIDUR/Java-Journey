package MultiThreading.OreillyMultithreadingMasterclass;

import java.io.File;

public class FileProcess {
    public static void main(String[] args){
        Thread thread = new Thread(new FileWatcher(), "MyThread");
        thread.start();
    }

    static class FileWatcher implements Runnable {
        File file;

        @Override
        public void run() {
            System.out.println(System.getProperty("user.dir"));


//            file = new File("MultiThreading/OreillyMultithreadingMasterclass");
        }

        private void sleep()
        {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
