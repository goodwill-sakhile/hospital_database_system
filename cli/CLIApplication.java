package com.hms.cli;

import java.util.Scanner;

/**
 * Runs the console-based hospital system.
 */
public class CLIApplication {
    private final Scanner scanner = new Scanner(System.in);
    private final CommandRouter router = new CommandRouter();

    public void start() {
        System.out.println("=== Hospital Management System ===");
        System.out.println("Type 'help' for commands.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            router.route(input);
        }
    }
}
