package com.hms.emergency;

public class TriageManager {
    private final EmergencyQueue queue;

    public TriageManager(EmergencyQueue queue) {
        this.queue = queue;
    }

    public void assessAndAdd(String patientId, String name, TriageLevel level, String symptoms) {
        EmergencyPatient p = new EmergencyPatient(patientId, name, level, symptoms);
        queue.admit(p);
    }

    public EmergencyPatient getNext() {
        return queue.nextPatient();
    }
}
