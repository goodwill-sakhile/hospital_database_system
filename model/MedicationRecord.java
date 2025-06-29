package com.hms.model;

/**
 * Represents a patient's medical record.
 */
public class MedicalRecord {
    private String recordId;
    private String patientId;
    private String diagnosis;
    private String treatment;
    private String doctorId;

    public MedicalRecord(String recordId, String patientId, String diagnosis, String treatment, String doctorId) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.doctorId = doctorId;
    }

    public String getRecordId() { return recordId; }

    public String getPatientId() { return patientId; }

    public String getDiagnosis() { return diagnosis; }

    public String getTreatment() { return treatment; }

    public String getDoctorId() { return doctorId; }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "recordId='" + recordId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", treatment='" + treatment + '\'' +
                ", doctorId='" + doctorId + '\'' +
                '}';
    }
}
