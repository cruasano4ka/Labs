package org.example.commands;

public class UpdateIdCommand implements Command {

    private String description = "update id {element} - обновить значение элемента коллекции, id которого равен заданному";

    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "update";
    }
}
