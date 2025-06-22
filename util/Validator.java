package com.hms.util;

/**
 * Utility for validating strings and inputs.
 */
public class Validator {

    public static boolean isEmailValid(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static boolean isPhoneValid(String phone) {
        return phone.matches("\\d{10,15}");
    }

    public static boolean isNotEmpty(String str) {
        return str != null && !str.trim().isEmpty();
    }
}
