package com.hms.service;

import com.hms.model.Doctor;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages doctor-related operations.
 */
public class DoctorService {
    private List<Doctor> doctors = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added: " + doctor.getName());
    }

    public Doctor findById(String id) {
        for (Doctor d : doctors) {
            if (d.getId().equals(id)) {
                return d;
            }
        }
        return null;
    }

    public void removeDoctor(String id) {
        doctors.removeIf(d -> d.getId().equals(id));
        System.out.println("Doctor removed.");
    }

    public List<Doctor> getAllDoctors() {
        return doctors;
    }
}
