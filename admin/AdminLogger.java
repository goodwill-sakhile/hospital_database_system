package com.hms.admin;

import java.time.LocalDateTime;

public class AdminLogger {
    public static void log(String message) {
        System.out.println("[ADMIN LOG " + LocalDateTime.now() + "] " + message);
    }
}
