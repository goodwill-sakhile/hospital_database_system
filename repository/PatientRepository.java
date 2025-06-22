package com.hms.repository;

import com.hms.model.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 * Repository for storing and retrieving patients.
 */
public class PatientRepository {
    private final List<Patient> patients = new ArrayList<>();

    public void save(Patient patient) {
        patients.add(patient);
    }

    public Patient findById(String id) {
        for (Patient p : patients) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void delete(String id) {
        patients.removeIf(p -> p.getId().equals(id));
    }

    public List<Patient> findAll() {
        return new ArrayList<>(patients);
    }
}
