package com.hms.service;

import com.hms.model.Billing;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles billing operations for patients.
 */
public class BillingService {
    private List<Billing> billings = new ArrayList<>();

    public void createBill(Billing bill) {
        billings.add(bill);
        System.out.println("Billing created for patient ID: " + bill.getPatientId());
    }

    public Billing getBillById(String id) {
        for (Billing b : billings) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public void markBillAsPaid(String id) {
        Billing bill = getBillById(id);
        if (bill != null) {
            bill.setPaid(true);
            System.out.println("Bill marked as paid.");
        } else {
            System.out.println("Bill not found.");
        }
    }

    public List<Billing> getAllBills() {
        return billings;
    }
}
