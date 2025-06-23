package com.hms.discharge;

public class DischargeSummary {
    private String patientId;
    private String diagnosis;
    private String treatment;
    private String medication;
    private String followUp;

    public DischargeSummary(String patientId, String diagnosis, String treatment, String medication, String followUp) {
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.medication = medication;
        this.followUp = followUp;
    }

    @Override
    public String toString() {
        return "Discharge Summary for Patient: " + patientId + "\nDiagnosis: " + diagnosis +
               "\nTreatment: " + treatment + "\nMedication: " + medication +
               "\nFollow-up: " + followUp;
    }
}
