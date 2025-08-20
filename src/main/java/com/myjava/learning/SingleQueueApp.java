package com.myjava.learning;

import java.util.Queue;

import com.myjava.Collection.SingleQueue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();
        System.out.println(queue.size());

        System.out.println(queue.offer("eef"));
        System.out.println(queue.offer("dsf"));
        System.out.println(queue.offer("gag"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
