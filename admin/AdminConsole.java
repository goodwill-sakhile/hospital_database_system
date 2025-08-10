package com.hms.admin;

import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminConsole {

    private final AdminAuthService auth;
    private final DatabaseBackupManager backupManager;
    private final ImportExportService ioService;
    private final SystemHealthMonitor healthMonitor;
    private final ShutdownScheduler shutdownScheduler;

    public AdminConsole() {
        auth = new AdminAuthService();
        backupManager = new DatabaseBackupManager();
        ioService = new ImportExportService();
        healthMonitor = new SystemHealthMonitor();
        shutdownScheduler = new ShutdownScheduler();
    }

    public void start() {
        try (Scanner sc = new Scanner(System.in)) {
            // Authentication
            System.out.print("Admin Username: ");
            String user = sc.nextLine();

            String pass = readPassword("Password: ");
            if (!auth.login(user, pass)) {
                System.out.println("Access denied.");
                return;
            }

            System.out.println("Welcome, admin.");

            boolean running = true;
            while (running) {
                printMenu();
                int choice = readChoice(sc);
                switch (choice) {
                    case 1 -> {
                        try {
                            backupManager.backup();
                        } catch (Exception e) {
                            System.out.println("Backup failed: " + e.getMessage());
                        }
                    }
                    case 2 -> {
                        try {
                            backupManager.restore();
                        } catch (Exception e) {
                            System.out.println("Restore failed: " + e.getMessage());
                        }
                    }
                    case 3 -> {
                        try {
                            ioService.exportToCSV(new BulkUserImporter().generateDummyUsers(5), "data/users.csv");
                            System.out.println("Users exported successfully.");
                        } catch (Exception e) {
                            System.out.println("Export failed: " + e.getMessage());
                        }
                    }
                    case 4 -> {
                        try {
                            ioService.importFromCSV("data/users.csv");
                            System.out.println("Users imported successfully.");
                        } catch (Exception e)
