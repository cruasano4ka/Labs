package org.example.commands;

import org.example.App;
import org.example.CommandManager;

public class HelpCommand implements Command {

    private final String description = "help - вывести спарвку по доступным командам";

    public void execute() {
        CommandManager manager = App.getInstance().getCommandManager();
        for (Command command : manager.getCommands().values()) {
            System.out.println(command.getDescription());
        }
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return "help";
    }
}
