package com.hms.vaccination;

import java.time.LocalDate;
import java.util.List;

public class VaccinationManager {
    private final VaccinationRepository repository;

    public VaccinationManager(VaccinationRepository repository) {
        this.repository = repository;
    }

    public void administerDose(String patientId, Vaccine vaccine, int doseNumber) {
        List<VaccinationRecord> records = repository.getRecordsForPatient(patientId);
        int maxDoseGiven = records.stream()
                .filter(r -> r.getVaccine().getVaccineId().equals(vaccine.getVaccineId()))
                .mapToInt(VaccinationRecord::getDoseNumber)
                .max()
                .orElse(0);

        if (!VaccinationValidator.canAdministerDose(vaccine, maxDoseGiven, doseNumber)) {
            return;
        }

        String recordId = "VR" + System.currentTimeMillis();
        VaccinationRecord record = new VaccinationRecord(recordId, patientId, vaccine, doseNumber, LocalDate.now());
        repository.addRecord(record);
        System.out.println("Dose #" + doseNumber + " administered to patient " + patientId);

        if (doseNumber < vaccine.getRequiredDoses()) {
            LocalDate nextDate = LocalDate.now().plusWeeks(4);
            VaccinationSchedule schedule = new VaccinationSchedule(patientId, vaccine, doseNumber + 1, nextDate);
            repository.addSchedule(schedule);
            System.out.println("Next dose scheduled on " + nextDate);
        }
    }
}
