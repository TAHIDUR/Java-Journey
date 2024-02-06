package MultiThreading;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryTest implements ThreadFactory {

    public Thread newThread(Runnable command)
    {
        return new Thread(command);
    }
}
