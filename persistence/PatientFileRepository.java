package com.hms.persistence;

import com.hms.model.Patient;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Stores patients in a file (CSV-style).
 */
public class PatientFileRepository {
    private final String filePath = "data/patients.csv";

    public void saveAll(List<Patient> patients) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Patient p : patients) {
                writer.write(p.getId() + "," + p.getName() + "," + p.getAddress() + "," + p.getPhone() + "," + p.getEmail());
                writer.newLine();
            }
        }
    }

    public List<Patient> loadAll() throws IOException {
        List<Patient> patients = new ArrayList<>();
        if (!FileStorage.fileExists(filePath)) return patients;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    Patient p = new Patient(parts[0], parts[1], parts[2], parts[3], parts[4]);
                    patients.add(p);
                }
            }
        }

        return patients;
    }
}
