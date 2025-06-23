package com.hms.admin;

import java.io.*;
import java.time.LocalDateTime;

public class DatabaseBackupManager {
    private final String backupFile = "data/backup.db";

    public void backup() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(backupFile))) {
            writer.write("Backup created at: " + LocalDateTime.now());
            writer.newLine();
            writer.write("Patient records, doctors, nurses, etc.");
            writer.newLine();
            AdminLogger.log("Database backup completed.");
        } catch (IOException e) {
            AdminLogger.log("Backup failed: " + e.getMessage());
        }
    }

    public void restore() {
        System.out.println("Restoring from backup...");
        // Simulate restore logic here
    }
}
