package com.hms.model;

import java.time.LocalDateTime;

/**
 * Represents a patient's visit to the hospital.
 */
public class Visit {
    private String id;
    private String patientId;
    private String doctorId;
    private LocalDateTime visitDate;
    private String notes;

    public Visit(String id, String patientId, String doctorId, LocalDateTime visitDate, String notes) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.visitDate = visitDate;
        this.notes = notes;
    }

    public String getId() { return id; }

    public String getPatientId() { return patientId; }

    public String getDoctorId() { return doctorId; }

    public LocalDateTime getVisitDate() { return visitDate; }

    public String getNotes() { return notes; }

    public void setNotes(String notes) { this.notes = notes; }

    @Override
    public String toString() {
        return "Visit{" +
                "id='" + id + '\'' +
                ", patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", visitDate=" + visitDate +
                ", notes='" + notes + '\'' +
                '}';
    }
}
