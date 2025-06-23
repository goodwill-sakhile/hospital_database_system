package com.hms.vaccination;

import java.util.List;

public class VaccinationService {
    private final VaccinationRepository repository;

    public VaccinationService(VaccinationRepository repository) {
        this.repository = repository;
    }

    public List<VaccinationRecord> getPatientVaccinations(String patientId) {
        return repository.getRecordsForPatient(patientId);
    }

    public List<VaccinationSchedule> getAllSchedules() {
        return repository.getSchedules();
    }
}
