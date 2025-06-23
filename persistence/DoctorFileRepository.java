package com.hms.persistence;

import com.hms.model.Doctor;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Stores doctors to a file.
 */
public class DoctorFileRepository {
    private final String filePath = "data/doctors.csv";

    public void saveAll(List<Doctor> doctors) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Doctor d : doctors) {
                writer.write(d.getId() + "," + d.getName() + "," + d.getDepartment() + "," + d.getPhone() + "," + d.getEmail());
                writer.newLine();
            }
        }
    }

    public List<Doctor> loadAll() throws IOException {
        List<Doctor> list = new ArrayList<>();
        if (!FileStorage.fileExists(filePath)) return list;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    Doctor d = new Doctor(parts[0], parts[1], parts[2], parts[3], parts[4]);
                    list.add(d);
                }
            }
        }
        return list;
    }
}
