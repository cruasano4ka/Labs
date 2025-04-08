package org.example.commands;

import org.example.App;
import org.example.FlatBuilder;

import java.util.Scanner;

public class AddCommand implements Command {

    private String description = "add - добавить новый элемент в коллекцию";

    @Override
    public void execute() {
        Scanner scanner = App.getInstance().getScanner();
        FlatBuilder flatBuilder = new FlatBuilder();
        flatBuilder.buildFlat();
        scanner.nextLine();
    }

    @Override
    public String getName() {
        return "add";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
