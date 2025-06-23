package com.hms.persistence;

import com.hms.model.Appointment;
import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Stores appointments.
 */
public class AppointmentFileRepository {
    private final String filePath = "data/appointments.csv";

    public void saveAll(List<Appointment> list) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Appointment a : list) {
                writer.write(a.getId() + "," + a.getPatientId() + "," + a.getDoctorId() + "," +
                             a.getDateTime().toString() + "," + a.getReason());
                writer.newLine();
            }
        }
    }

    public List<Appointment> loadAll() throws IOException {
        List<Appointment> list = new ArrayList<>();
        if (!FileStorage.fileExists(filePath)) return list;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 5);
                if (parts.length == 5) {
                    Appointment a = new Appointment(parts[0], parts[1], parts[2],
                        LocalDateTime.parse(parts[3]), parts[4]);
                    list.add(a);
                }
            }
        }
        return list;
    }
}
