package com.hms.audit;

/**
 * Determines audit policies.
 */
public class AuditPolicy {

    public static boolean isCritical(AuditAction action) {
        return action == AuditAction.DELETE_PATIENT || action == AuditAction.LOGIN;
    }

    public static AuditLevel getDefaultLevel(AuditAction action) {
        return isCritical(action) ? AuditLevel.CRITICAL : AuditLevel.INFO;
    }
}
