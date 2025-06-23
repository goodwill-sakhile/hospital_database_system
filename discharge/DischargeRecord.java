package com.hms.discharge;

import java.time.LocalDate;

public class DischargeRecord {
    private String patientId;
    private LocalDate dischargeDate;
    private DischargeReason reason;
    private String notes;

    public DischargeRecord(String patientId, LocalDate dischargeDate, DischargeReason reason, String notes) {
        this.patientId = patientId;
        this.dischargeDate = dischargeDate;
        this.reason = reason;
        this.notes = notes;
    }

    public String getPatientId() { return patientId; }
    public LocalDate getDischargeDate() { return dischargeDate; }
    public DischargeReason getReason() { return reason; }
    public String getNotes() { return notes; }

    @Override
    public String toString() {
        return "Discharged: " + patientId + " on " + dischargeDate + " (" + reason + ") - " + notes;
    }
}
