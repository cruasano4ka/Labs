package org.example.commands;

public class RemoveHeadCommand implements Command {

    private String description = "remove_head - вывести первый элемент коллекции и удалить его";

    @Override
    public void execute(String arg) {

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "remove_head";
    }
}
