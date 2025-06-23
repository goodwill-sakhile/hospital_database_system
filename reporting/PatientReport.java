package com.hms.reporting;

import com.hms.model.Patient;
import com.hms.repository.PatientRepository;

import java.util.List;

/**
 * Displays all patients in the system.
 */
public class PatientReport implements ReportGenerator {
    private final PatientRepository repo;

    public PatientReport(PatientRepository repo) {
        this.repo = repo;
    }

    @Override
    public void generateReport() {
        List<Patient> list = repo.findAll();
        System.out.println("=== Patient Report ===");
        for (Patient p : list) {
            System.out.println(p.getId() + " - " + p.getName() + " - " + p.getEmail());
        }
    }
}
