package com.hms.cli;

/**
 * Formats output to the console.
 */
public class OutputFormatter {
    public static void printHeader(String title) {
        System.out.println("=== " + title + " ===");
    }

    public static void printDivider() {
        System.out.println("-------------------------");
    }
}
