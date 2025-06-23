package com.hms.audit;

import java.util.HashMap;
import java.util.Map;

/**
 * Tracks session activity.
 */
public class UserActivityMonitor {
    private final Map<String, Integer> userActivity = new HashMap<>();

    public void increment(String username) {
        userActivity.put(username, userActivity.getOrDefault(username, 0) + 1);
    }

    public void printSummary() {
        System.out.println("=== User Activity Summary ===");
        for (String user : userActivity.keySet()) {
            System.out.println(user + ": " + userActivity.get(user) + " actions");
        }
    }
}
