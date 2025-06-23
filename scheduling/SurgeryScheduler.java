package com.hms.scheduling;

import java.time.LocalDateTime;

public class SurgeryScheduler {
    private final SurgeryQueue queue;

    public SurgeryScheduler(SurgeryQueue queue) {
        this.queue = queue;
    }

    public void schedule(String surgeryId, String patientId, String surgeonId, LocalDateTime time) {
        Surgery s = new Surgery(surgeryId, patientId, surgeonId, time);
        queue.enqueue(s);
        System.out.println("Surgery Scheduled: " + surgeryId);
    }

    public void nextSurgery() {
        Surgery next = queue.dequeue();
        if (next != null) {
            System.out.println("Next surgery starting: " + next);
        } else {
            System.out.println("No surgeries scheduled.");
        }
    }
}
