package com.hms.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Simulates loading app configuration.
 */
public class ConfigLoader {
    private static final Map<String, String> config = new HashMap<>();

    static {
        config.put("APP_NAME", "Hospital Management System");
        config.put("VERSION", "1.0.0");
        config.put("ADMIN_EMAIL", "admin@hospital.local");
    }

    public static String get(String key) {
        return config.getOrDefault(key, "undefined");
    }
}
