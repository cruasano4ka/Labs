package org.example.commands;

public class ClearCommand implements Command {

    private String description = "clear - очисить коллекцию";

    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "clear";
    }
}
