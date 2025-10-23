package MultiThreading.OreillyMultithreadingMasterclass;

public class ThreadGroupClass {

    public static void main(String[] args) {
//        ThreadGroup parentGroup = new ThreadGroup("ThreadParentGroup");
//        ThreadGroup group = new ThreadGroup(parentGroup,"ThreadGroup");
//        System.out.println(parentGroup.getParent().getName());
//        System.out.println(group.getParent().getName());

        ThreadGroup group = new ThreadGroup("ThreadGroup");
        group.setMaxPriority(Thread.NORM_PRIORITY);

        // First parameter is Group name & Third parameter is thread name

        Thread firstThread = new Thread(group, () -> {
            Thread currentThread = Thread.currentThread();
            System.out.println("1. Current Thread: " + currentThread.getName() + " priority: " + currentThread.getPriority());
        }, "FirstThread");

        Thread secondThread = new Thread(group, () -> {
            Thread currentThread = Thread.currentThread();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
//                System.out.println(currentThread.getName() + " interrupted");
            }
            System.out.println("2. Current Thread: " + currentThread.getName() + " priority: " + currentThread.getPriority());
        }, "SecondThread");

        Thread thirdThread = new Thread(group, () -> {
            Thread currentThread = Thread.currentThread();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
//                System.out.println(currentThread.getName() + " interrupted");
            }
            System.out.println("3. Current Thread: " + currentThread.getName() + " priority: " + currentThread.getPriority());
        }, "ThirdThread");


        firstThread.start();
        secondThread.start();
        thirdThread.start();

        firstThread.interrupt();

        group.interrupt();

        ThreadGroup rootGroup = group.getParent();

        System.out.println("is Group " + group.getName() + " is parent of " + rootGroup.getName() + " ? " + rootGroup.parentOf(group));
    }
}
