package MultiThreading;

public class Task extends Thread{
    @Override
    public void run() {
        for(int i = 1; i < 10; i ++)
            System.out.println(this.getName());
    }
}
