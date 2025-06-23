package com.hms.discharge;

import java.time.LocalDate;

public class DischargeManager {
    private final DischargeRepository repo;

    public DischargeManager(DischargeRepository repo) {
        this.repo = repo;
    }

    public void discharge(String patientId, DischargeReason reason, String notes) {
        DischargeRecord record = new DischargeRecord(patientId, LocalDate.now(), reason, notes);
        repo.addRecord(record);
        System.out.println("Patient " + patientId + " discharged.");
    }
}
