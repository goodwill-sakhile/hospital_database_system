package com.hms.cli;

import java.util.HashMap;
import java.util.Map;

/**
 * Routes user input to the appropriate command handler.
 */
public class CommandRouter {
    private final Map<String, Command> commands = new HashMap<>();

    public CommandRouter() {
        commands.put("help", new HelpCommand());
        commands.put("menu", new Menu());
        // Add more commands here later
    }

    public void route(String input) {
        String[] parts = input.split(" ");
        String commandKey = parts[0];
        Command command = commands.get(commandKey.toLowerCase());

        if (command != null) {
            command.execute(input);
        } else {
            System.out.println("Unknown command. Type 'help' to list available commands.");
        }
    }
}
