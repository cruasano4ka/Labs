package org.example.commands;

public class MaxByDateCommand implements Command {

    private String description = "max_by_creation_date - выводит самый старый объект в коллекции";

    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "max_by_date";
    }
}
