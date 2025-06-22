package com.hms.repository;

import com.hms.model.Billing;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages billing data.
 */
public class BillingRepository {
    private final List<Billing> billings = new ArrayList<>();

    public void save(Billing bill) {
        billings.add(bill);
    }

    public List<Billing> findAll() {
        return new ArrayList<>(billings);
    }

    public Billing findById(String id) {
        for (Billing b : billings) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public void delete(String id) {
        billings.removeIf(b -> b.getId().equals(id));
    }
}
