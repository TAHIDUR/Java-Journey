package classes;

import java.util.List;
import java.util.concurrent.Callable;

public class WorkerThread implements Callable<Integer> {

    private List<Integer> integerList = null;

    public WorkerThread(List<Integer> integerList){
        this.integerList = integerList;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running");
        Thread.sleep(2000);
        int sum = 0;
        for(int val: integerList){
            sum += val;
        }
        System.out.println("Calculated sum from "+ integerList.getFirst() + " to " + integerList.getLast() + " is: " + sum);
        return sum;
    }

}