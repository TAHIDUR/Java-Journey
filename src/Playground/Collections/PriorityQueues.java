package Playground.Collections;

import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        // By default min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(5);
        minHeap.offer(7);
        minHeap.offer(33);
        minHeap.offer(6);
        minHeap.offer(9);

        System.out.println(minHeap);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        maxHeap.add(3);
        maxHeap.add(5);
        maxHeap.add(2);
        maxHeap.add(1);
        maxHeap.add(8);

        System.out.println(maxHeap);
    }
}
