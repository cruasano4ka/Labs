package org.example.commands;

public class AddIfMaxCommand implements Command {

    private String description = "add_if_max {element} -  добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции";

    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "add_if_max";
    }
}
