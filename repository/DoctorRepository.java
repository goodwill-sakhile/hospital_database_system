package com.hms.repository;

import com.hms.model.Doctor;
import java.util.ArrayList;
import java.util.List;

/**
 * Repository for doctor data access.
 */
public class DoctorRepository {
    private final List<Doctor> doctors = new ArrayList<>();

    public void save(Doctor doctor) {
        doctors.add(doctor);
    }

    public Doctor findById(String id) {
        for (Doctor d : doctors) {
            if (d.getId().equals(id)) {
                return d;
            }
        }
        return null;
    }

    public List<Doctor> findAll() {
        return new ArrayList<>(doctors);
    }

    public void delete(String id) {
        doctors.removeIf(d -> d.getId().equals(id));
    }
}
