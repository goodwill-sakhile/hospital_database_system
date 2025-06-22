package com.hms.cli;

import java.util.Scanner;

/**
 * Handles and validates user input.
 */
public class InputHandler {
    private final Scanner scanner = new Scanner(System.in);

    public String prompt(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine().trim();
    }

    public int promptInt(String message) {
        System.out.print(message + ": ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Try again: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
