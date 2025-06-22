package com.hms.repository;

import com.hms.model.Medication;
import java.util.ArrayList;
import java.util.List;

/**
 * Repository for managing medication stock and prescriptions.
 */
public class MedicationRepository {
    private final List<Medication> medications = new ArrayList<>();

    public void save(Medication med) {
        medications.add(med);
    }

    public List<Medication> findAll() {
        return new ArrayList<>(medications);
    }

    public void delete(String id) {
        medications.removeIf(m -> m.getId().equals(id));
    }
}
