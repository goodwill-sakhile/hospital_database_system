package com.hms.reporting;

import com.hms.model.Billing;
import com.hms.repository.BillingRepository;

import java.util.List;

/**
 * Shows unpaid and paid bills.
 */
public class BillingReport implements ReportGenerator {
    private final BillingRepository repo;

    public BillingReport(BillingRepository repo) {
        this.repo = repo;
    }

    @Override
    public void generateReport() {
        List<Billing> bills = repo.findAll();
        System.out.println("=== Billing Report ===");
        for (Billing b : bills) {
            System.out.println(b.getId() + " - " + b.getPatientId() + " - R" + b.getAmount() + " - " + (b.isPaid() ? "Paid" : "Unpaid"));
        }
    }
}
