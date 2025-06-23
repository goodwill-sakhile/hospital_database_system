package com.hms.persistence;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Generic file-based persistence.
 */
public class FileStorage {

    public static void writeLines(String filePath, List<String> lines) throws IOException {
        Files.write(Path.of(filePath), lines);
    }

    public static List<String> readLines(String filePath) throws IOException {
        return Files.readAllLines(Path.of(filePath));
    }

    public static boolean fileExists(String filePath) {
        return Files.exists(Path.of(filePath));
    }
}
