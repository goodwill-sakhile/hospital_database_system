package com.hms.admin;

import java.io.*;
import java.util.List;

public class ImportExportService {

    public void exportToCSV(List<String> data, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
            AdminLogger.log("Exported data to " + filePath);
        } catch (IOException e) {
            AdminLogger.log("Export failed: " + e.getMessage());
        }
    }

    public void importFromCSV(String filePath) {
        System.out.println("Importing data from " + filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Imported: " + line);
            }
            AdminLogger.log("Import successful.");
        } catch (IOException e) {
            AdminLogger.log("Import failed: " + e.getMessage());
        }
    }
}
