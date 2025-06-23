package com.hms.reporting;

import com.hms.model.Doctor;
import com.hms.repository.DoctorRepository;

import java.util.List;

/**
 * Displays list of doctors.
 */
public class DoctorReport implements ReportGenerator {
    private final DoctorRepository repo;

    public DoctorReport(DoctorRepository repo) {
        this.repo = repo;
    }

    @Override
    public void generateReport() {
        List<Doctor> list = repo.findAll();
        System.out.println("=== Doctor Report ===");
        for (Doctor d : list) {
            System.out.println(d.getId() + " - " + d.getName() + " (" + d.getDepartment() + ")");
        }
    }
}
