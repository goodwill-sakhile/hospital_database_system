package com.hms.audit;

/**
 * Prints audit trail to console.
 */
public class AuditViewer {

    public static void displayAll() {
        for (AuditEntry entry : AuditLogger.getTrail().getAll()) {
            System.out.println(entry.format());
        }
    }

    public static void displayByUser(String user) {
        for (AuditEntry entry : AuditLogger.getTrail().findByUser(user)) {
            System.out.println(entry.format());
        }
    }
}
