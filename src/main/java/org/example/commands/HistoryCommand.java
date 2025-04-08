package org.example.commands;

public class HistoryCommand implements Command {

    private String description = "history - вывести последние 14 команд (без их аргументов)";

    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "history";
    }
}
