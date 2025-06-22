package com.hms.util;

import java.time.LocalDateTime;

/**
 * Utility for logging messages.
 */
public class LoggerUtil {

    public static void info(String message) {
        System.out.println("[INFO " + LocalDateTime.now() + "] " + message);
    }

    public static void error(String message) {
        System.err.println("[ERROR " + LocalDateTime.now() + "] " + message);
    }

    public static void warn(String message) {
        System.out.println("[WARN " + LocalDateTime.now() + "] " + message);
    }
}
