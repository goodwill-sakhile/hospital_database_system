package com.hms.util;

import java.util.UUID;

/**
 * Generates unique IDs.
 */
public class IDGenerator {

    public static String generateID(String prefix) {
        return prefix.toUpperCase() + "-" + UUID.randomUUID().toString().substring(0, 8);
    }
}
