package org.example.commands;

public class RemoveByIdCommand implements Command {

    private String description = "remove_by_id id - удалить элемент из коллекции по его id";

    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "remove_by_id";
    }
}
