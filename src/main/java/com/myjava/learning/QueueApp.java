package com.myjava.learning;

// import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void queueMain(String[] args) {
        // Queue<String> queue = new ArrayDeque<>(10); THIS IS USELESS BECOZ DEQUE WILL GROW UR ARRAY
        // Queue<String> queue = new ArrayDeque<>();
        Queue<String> queue = new PriorityQueue<>();

        queue.add("null");
        queue.add("add");
        queue.add("nulk");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }
        
        System.out.println(queue.size());
    }
}
