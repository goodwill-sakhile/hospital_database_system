package com.hms.admin;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Admin Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        if (!auth.login(user, pass)) {
            System.out.println("Access denied.");
            return;
        }

        System.out.println("Welcome, admin.");
        System.out.println("1. Backup DB");
        System.out.println("2. Restore DB");
        System.out.println("3. Export Users");
        System.out.println("4. Import Users");
        System.out.println("5. Check System Health");
        System.out.println("6. Schedule Shutdown");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1 -> backupManager.backup();
            case 2 -> backupManager.restore();
            case 3 -> ioService.exportToCSV(new BulkUserImporter().generateDummyUsers(5), "data/users.csv");
            case 4 -> ioService.importFromCSV("data/users.csv");
            case 5 -> healthMonitor.checkSystemHealth();
            case 6 -> shutdownScheduler.scheduleShutdown(5000);
            default -> System.out.println("Invalid choice.");
        }
    }
}
