package org.example.commands;

public class ShowCommand implements Command {

    private String description = "show - вывести все элементы коллекции в строковой форме";

    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "show";
    }
}
