package com.hms.audit;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AuditEntry implements Serializable {
    private final String username;
    private final AuditAction action;
    private final AuditLevel level;
    private final String details;
    private final LocalDateTime timestamp;

    public AuditEntry(String username, AuditAction action, AuditLevel level, String details) {
        this.username = username;
        this.action = action;
        this.level = level;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }

    public String format() {
        return "[" + timestamp + "] (" + level + ") [" + username + "] -> " + action + ": " + details;
    }

    public AuditLevel getLevel() {
        return level;
    }

    public String getUsername() {
        return username;
    }
}
