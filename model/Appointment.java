package com.hms.model;

import java.time.LocalDateTime;

/**
 * Represents an appointment between a patient and a doctor.
 */
public class Appointment {
    private String id;
    private String patientId;
    private String doctorId;
    private LocalDateTime appointmentDate;
    private String reason;

    public Appointment(String id, String patientId, String doctorId, LocalDateTime appointmentDate, String reason) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.reason = reason;
    }

    public String getId() { return id; }

    public String getPatientId() { return patientId; }

    public String getDoctorId() { return doctorId; }

    public LocalDateTime getAppointmentDate() { return appointmentDate; }

    public String getReason() { return reason; }

    public void setReason(String reason) { this.reason = reason; }

    @Override
    public String toString() {
        return "Appointment{" +
                "id='" + id + '\'' +
                ", patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", reason='" + reason + '\'' +
                '}';
    }
}
