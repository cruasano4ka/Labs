package org.example.commands;

public class ExecuteCommand implements Command{

    private String description = "execute - считать и исполнить скрипт из указанного файла";

    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "execute";
    }
}
