package org.example.commands;

public class PrintUniqueCHCommand implements Command {

    private String description = "print_unique_central_heating - вывести уникальные значения поля centralHeating всех элементов в коллекции";

    @Override
    public void execute(String arg) {

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "print_unique_central_heating";
    }
}
