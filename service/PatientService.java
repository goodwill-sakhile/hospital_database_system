package com.hms.service;

import com.hms.model.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides services for managing patients.
 */
public class PatientService {
    private List<Patient> patientList = new ArrayList<>();

    public void registerPatient(Patient patient) {
        patientList.add(patient);
        System.out.println("Patient registered: " + patient.getName());
    }

    public void updatePatient(String id, Patient updated) {
        for (Patient patient : patientList) {
            if (patient.getId().equals(id)) {
                patient.setName(updated.getName());
                patient.setAddress(updated.getAddress());
                patient.setPhone(updated.getPhone());
                patient.setEmail(updated.getEmail());
                System.out.println("Patient updated.");
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    public Patient getPatientById(String id) {
        for (Patient patient : patientList) {
            if (patient.getId().equals(id)) {
                return patient;
            }
        }
        return null;
    }

    public void deletePatient(String id) {
        patientList.removeIf(p -> p.getId().equals(id));
        System.out.println("Patient deleted.");
    }

    public List<Patient> getAllPatients() {
        return patientList;
    }
}
