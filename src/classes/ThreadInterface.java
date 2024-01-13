package classes;

public class ThreadInterface implements Runnable {
    private String name;
    public ThreadInterface(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread is running from Runnable interface: " + this.name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
