package org.example.commands;

public class SaveCommmand implements Command {

    private String description = "save - сохранить коллекцию в файл";

    @Override
    public void execute(String arg) {

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "save";
    }
}
