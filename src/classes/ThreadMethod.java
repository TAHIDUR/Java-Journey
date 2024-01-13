package classes;

public class ThreadMethod extends Thread {
    private String name;
    public ThreadMethod(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread is running from Thread Class: "+ this.name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
