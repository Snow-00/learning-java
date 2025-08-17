package com.myjava.learning;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void dequeMain(String[] args) {
        Deque<String> stack = new LinkedList<>();

        // stack.offerFirst("kull");
        // stack.offerFirst("nill");
        // stack.offerFirst("aull");
        stack.offerLast("kull");
        stack.offerLast("nill");
        stack.offerLast("aull");

        // for (var value : stack) {
        //     System.out.println(value);
        // }

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("aki");
        queue.offerLast("nki");
        queue.offerLast("kki");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
