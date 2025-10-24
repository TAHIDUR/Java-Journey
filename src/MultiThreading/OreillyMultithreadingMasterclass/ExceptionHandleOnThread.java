package MultiThreading.OreillyMultithreadingMasterclass;

import java.util.List;

public class ExceptionHandleOnThread {
    public static void main(String[] args) {
        CustomThreadGroup threadGroup = new CustomThreadGroup("ThreadGroup");
        Thread thread = new Thread(threadGroup, new MyThread(), "FirstThread");

        //        this is 2nd priority
        Thread.setDefaultUncaughtExceptionHandler((Thread t, Throwable e) -> {
            System.out.println("Exception handled default level: " + e.getMessage());
        });


        //        this is 1st priority
        thread.setUncaughtExceptionHandler((Thread t, Throwable e) -> {
            System.out.println("Exception handled thread level: " + e.getMessage());
        });
        thread.start();
    }

    static class CustomThreadGroup extends ThreadGroup {
        public CustomThreadGroup(String name) {
            super(name);
        }


        //        this is 3rd priority
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println("Exception in thread " + t.getName() + " is " + e.getMessage());
        }
    }

    static class MyThread implements Runnable {
        @Override
        public void run() {
            List<Integer> list = null;
            System.out.println(list.size());
        }
    }
}
