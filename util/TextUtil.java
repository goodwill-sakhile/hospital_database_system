package com.hms.util;

/**
 * Provides common string utilities.
 */
public class TextUtil {

    public static String capitalize(String text) {
        if (text == null || text.isEmpty()) return text;
        return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
    }

    public static String repeat(String s, int count) {
        return s.repeat(count);
    }
}
