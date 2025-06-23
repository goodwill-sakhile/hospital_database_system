package com.hms.reporting;

import com.hms.model.Medication;
import com.hms.repository.MedicationRepository;

import java.util.List;

/**
 * Shows all medication inventory.
 */
public class MedicationReport implements ReportGenerator {
    private final MedicationRepository repo;

    public MedicationReport(MedicationRepository repo) {
        this.repo = repo;
    }

    @Override
    public void generateReport() {
        List<Medication> meds = repo.findAll();
        System.out.println("=== Medication Report ===");
        for (Medication m : meds) {
            System.out.println(m.getId() + " - " + m.getName() + " - " + m.getDosage() + " (" + m.getInstructions() + ")");
        }
    }
}
