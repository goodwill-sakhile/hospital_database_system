package com.hms.vaccination;

import java.time.LocalDate;

public class VaccinationSchedule {
    private String patientId;
    private Vaccine vaccine;
    private int nextDoseNumber;
    private LocalDate nextDoseDate;

    public VaccinationSchedule(String patientId, Vaccine vaccine, int nextDoseNumber, LocalDate nextDoseDate) {
        this.patientId = patientId;
        this.vaccine = vaccine;
        this.nextDoseNumber = nextDoseNumber;
        this.nextDoseDate = nextDoseDate;
    }

    public String getPatientId() { return patientId; }
    public Vaccine getVaccine() { return vaccine; }
    public int getNextDoseNumber() { return nextDoseNumber; }
    public LocalDate getNextDoseDate() { return nextDoseDate; }

    @Override
    public String toString() {
        return "Next dose for " + patientId + ": " + vaccine.getType() + " dose #" + nextDoseNumber +
                " scheduled for " + nextDoseDate;
    }
}
