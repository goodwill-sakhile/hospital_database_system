package com.hms.util;

/**
 * Utility for safe math operations.
 */
public class MathUtil {

    public static double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }
}
