package org.example.commands;

public class RemoveByCHCommand implements Command {

    private String description = "remove_any_by_central_heating - удалить из коллекции один элемент, значение поля centralHeating которого эквивалентно заданному";

    @Override
    public void execute(String arg) {

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "remove_by_central_heating";
    }
}
