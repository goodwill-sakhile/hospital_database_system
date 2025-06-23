package com.hms.scheduling;

import java.time.LocalDateTime;

public class Surgery {
    private String surgeryId;
    private String patientId;
    private String surgeonId;
    private LocalDateTime scheduledTime;

    public Surgery(String surgeryId, String patientId, String surgeonId, LocalDateTime scheduledTime) {
        this.surgeryId = surgeryId;
        this.patientId = patientId;
        this.surgeonId = surgeonId;
        this.scheduledTime = scheduledTime;
    }

    @Override
    public String toString() {
        return "Surgery [" + surgeryId + "] - Patient: " + patientId + ", Surgeon: " + surgeonId + ", Time: " + scheduledTime;
    }
}
