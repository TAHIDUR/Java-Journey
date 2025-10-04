package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HappensBefore {

    int a = 0, b = 0, c = 0, x = 0;
    Lock lock = new ReentrantLock();

    public void writeThread() {

        lock.lock();
        a = 1;
        b = 1;
        c = 1;
        x = 1;
        lock.unlock();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(x);
    }

    public void readThread() {

        lock.lock();
        int r2 = x;
        int d1 = a;
        int d2 = b;
        int d3 = c;
        lock.unlock();
        System.out.println(r2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }

    public static void main(String[] args){
        HappensBefore happensBefore = new HappensBefore();
        Thread read = new Thread(() -> {
            happensBefore.writeThread();
        });

        Thread write = new Thread(() -> {
            happensBefore.readThread();
        });

        read.start();
        write.start();
    }
}
