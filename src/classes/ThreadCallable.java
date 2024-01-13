package classes;

import java.util.concurrent.Callable;

public class ThreadCallable implements Callable<String> {
    private String name;
    public ThreadCallable(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Integer count = 0;
        while (count < 4) {
            count++;
            System.out.println("Thread is running from Thread callable Class: "+ this.name);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return count.toString();
    }
}
