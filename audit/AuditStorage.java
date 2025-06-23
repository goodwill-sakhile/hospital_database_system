package com.hms.audit;

import java.io.*;
import java.util.List;

/**
 * Save/load audits from file.
 */
public class AuditStorage {
    private static final String filePath = "data/audit.log";

    public static void save(List<AuditEntry> entries) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for (AuditEntry e : entries) {
                writer.write(e.format());
                writer.newLine();
            }
        }
    }

    public static void printAuditFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("=== Audit Log ===");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
