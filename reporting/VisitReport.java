package com.hms.reporting;

import com.hms.model.Visit;
import com.hms.repository.VisitRepository;

import java.util.List;

/**
 * Report on all visit logs.
 */
public class VisitReport implements ReportGenerator {
    private final VisitRepository repo;

    public VisitReport(VisitRepository repo) {
        this.repo = repo;
    }

    @Override
    public void generateReport() {
        List<Visit> visits = repo.findAll();
        System.out.println("=== Visit Report ===");
        for (Visit v : visits) {
            System.out.println(v.getId() + " - Patient: " + v.getPatientId() + " at " + v.getTimestamp());
        }
    }
}
