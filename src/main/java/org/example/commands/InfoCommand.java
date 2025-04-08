package org.example.commands;

public class InfoCommand implements Command {

    private String description = "info - вывести информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)";

    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "info";
    }
}
