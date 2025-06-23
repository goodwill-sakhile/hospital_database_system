package com.hms.persistence;

import com.hms.model.Billing;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Stores billing data in file.
 */
public class BillingFileRepository {
    private final String filePath = "data/billing.csv";

    public void saveAll(List<Billing> bills) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Billing b : bills) {
                writer.write(b.getId() + "," + b.getPatientId() + "," + b.getAmount() + "," + b.getDate() + "," + b.isPaid());
                writer.newLine();
            }
        }
    }

    public List<Billing> loadAll() throws IOException {
        List<Billing> list = new ArrayList<>();
        if (!FileStorage.fileExists(filePath)) return list;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    Billing b = new Billing(parts[0], parts[1], Double.parseDouble(parts[2]), parts[3], Boolean.parseBoolean(parts[4]));
                    list.add(b);
                }
            }
        }
        return list;
    }
}
