package com.hms.util;

/**
 * Validates and formats phone numbers.
 */
public class PhoneUtil {

    public static String normalize(String phone) {
        return phone.replaceAll("[^\\d]", "");
    }

    public static boolean isSouthAfrican(String phone) {
        return normalize(phone).startsWith("27");
    }
}
