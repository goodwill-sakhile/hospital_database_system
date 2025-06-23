package com.hms.scheduling;

import java.util.LinkedList;
import java.util.Queue;

public class SurgeryQueue {
    private final Queue<Surgery> queue = new LinkedList<>();

    public void enqueue(Surgery surgery) {
        queue.add(surgery);
    }

    public Surgery dequeue() {
        return queue.poll();
    }

    public void printQueue() {
        System.out.println("=== Surgery Queue ===");
        for (Surgery s : queue) {
            System.out.println(s);
        }
    }
}
