package com.hms.emergency;

public class EmergencyService {
    private final EmergencyQueue queue;

    public EmergencyService(EmergencyQueue queue) {
        this.queue = queue;
    }

    public void serveNext() {
        EmergencyPatient next = queue.nextPatient();
        if (next == null) {
            System.out.println("No patients in emergency queue.");
        } else {
            System.out.println("Treating: " + next);
        }
    }
}
