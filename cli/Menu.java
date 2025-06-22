package com.hms.cli;

/**
 * Displays a list of features.
 */
public class Menu implements Command {
    @Override
    public void execute(String input) {
        System.out.println("Main Menu:");
        System.out.println("1. Register Patient");
        System.out.println("2. Schedule Appointment");
        System.out.println("3. Add Doctor");
        System.out.println("4. View Billing Info");
        System.out.println("5. Exit");
    }
}
