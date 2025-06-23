package com.hms.reporting;

import java.io.*;
import java.util.List;

/**
 * Exports any list of strings to CSV.
 */
public class CSVExporter {

    public static void export(String filePath, List<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Exported to: " + filePath);
        }
    }
}
