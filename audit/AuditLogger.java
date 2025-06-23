package com.hms.audit;

import com.hms.security.SessionManager;

public class AuditLogger {
    private static final AuditTrail trail = new AuditTrail();

    public static void log(AuditAction action, AuditLevel level, String details) {
        String user = SessionManager.isLoggedIn() ? SessionManager.getCurrentUser().getUsername() : "SYSTEM";
        trail.add(new AuditEntry(user, action, level, details));
    }

    public static AuditTrail getTrail() {
        return trail;
    }
}
