package MultiThreading;

public class ThreadJoin extends Thread {


    public static void main(String[] args){
        Thread print = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("From thread: "+ i);
            }
        });
        print.start();

        try {
            print.join();
            for (int j = 0; j < 50; j++) {
                System.out.println("From main thread: "+ j);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("100");
    }
}