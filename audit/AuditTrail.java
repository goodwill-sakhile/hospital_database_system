package com.hms.audit;

import java.util.ArrayList;
import java.util.List;

/**
 * In-memory audit trail.
 */
public class AuditTrail {
    private final List<AuditEntry> entries = new ArrayList<>();

    public void add(AuditEntry entry) {
        entries.add(entry);
    }

    public List<AuditEntry> getAll() {
        return entries;
    }

    public List<AuditEntry> findByUser(String username) {
        List<AuditEntry> result = new ArrayList<>();
        for (AuditEntry entry : entries) {
            if (entry.getUsername().equalsIgnoreCase(username)) {
                result.add(entry);
            }
        }
        return result;
    }
}
