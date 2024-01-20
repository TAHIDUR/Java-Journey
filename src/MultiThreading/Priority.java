package MultiThreading;

public class Priority {

    public static void main(String[] args) {
        Task task = new Task();
        Task newTask = new Task();

        newTask.setPriority(Thread.MAX_PRIORITY);
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        task.setPriority(Thread.MIN_PRIORITY);

        task.setName("First Thread");
        newTask.setName("New Thread");

        System.out.println(Thread.currentThread().getName());
        task.start();
        newTask.start();

    }
}
