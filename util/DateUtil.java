package com.hms.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Utility for formatting dates.
 */
public class DateUtil {

    public static String format(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public static LocalDate parse(String dateStr) {
        return LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
