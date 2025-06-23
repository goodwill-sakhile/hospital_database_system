package com.hms.vaccination;

import java.time.LocalDate;

public class VaccinationRecord {
    private String recordId;
    private String patientId;
    private Vaccine vaccine;
    private int doseNumber;
    private LocalDate vaccinationDate;

    public VaccinationRecord(String recordId, String patientId, Vaccine vaccine, int doseNumber, LocalDate vaccinationDate) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.vaccine = vaccine;
        this.doseNumber = doseNumber;
        this.vaccinationDate = vaccinationDate;
    }

    public String getRecordId() { return recordId; }
    public String getPatientId() { return patientId; }
    public Vaccine getVaccine() { return vaccine; }
    public int getDoseNumber() { return doseNumber; }
    public LocalDate getVaccinationDate() { return vaccinationDate; }

    @Override
    public String toString() {
        return "VaccinationRecord{" +
                "recordId='" + recordId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", vaccine=" + vaccine.getType() +
                ", doseNumber=" + doseNumber +
                ", vaccinationDate=" + vaccinationDate +
                '}';
    }
}
