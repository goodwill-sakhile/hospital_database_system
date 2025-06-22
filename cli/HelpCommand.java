package com.hms.cli;

/**
 * Displays available commands.
 */
public class HelpCommand implements Command {
    @Override
    public void execute(String input) {
        System.out.println("Available commands:");
        System.out.println("- help : Show this help");
        System.out.println("- menu : Show the main menu");
        System.out.println("- exit : Exit the application");
    }
}
