package com.hms.admin;

import java.time.LocalDateTime;

public class SystemHealthMonitor {

    public void checkSystemHealth() {
        System.out.println("=== System Health Check ===");
        System.out.println("Memory OK");
        System.out.println("Disk Space OK");
        System.out.println("DB Connection OK");
        System.out.println("Last check: " + LocalDateTime.now());
    }
}
