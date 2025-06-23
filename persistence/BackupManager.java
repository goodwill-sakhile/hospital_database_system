package com.hms.persistence;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Handles backups.
 */
public class BackupManager {

    public static void backup(String sourcePath, String backupPath) throws IOException {
        File source = new File(sourcePath);
        File backup = new File(backupPath);

        if (!source.exists()) return;

        Files.copy(source.toPath(), backup.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Backup completed: " + backupPath);
    }
}
