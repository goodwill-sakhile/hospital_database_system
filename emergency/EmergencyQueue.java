package com.hms.emergency;

import java.util.PriorityQueue;
import java.util.Comparator;

public class EmergencyQueue {
    private final PriorityQueue<EmergencyPatient> queue;

    public EmergencyQueue() {
        queue = new PriorityQueue<>(Comparator.comparing(EmergencyPatient::getLevel));
    }

    public void admit(EmergencyPatient patient) {
        queue.add(patient);
        System.out.println("Emergency patient added: " + patient);
    }

    public EmergencyPatient nextPatient() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void printQueue() {
        System.out.println("=== Triage Queue ===");
        for (EmergencyPatient p : queue) {
            System.out.println(p);
        }
    }
}
