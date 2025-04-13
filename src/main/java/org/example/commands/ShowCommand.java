package org.example.commands;

import org.example.App;
import org.example.model.Flat;

public class ShowCommand implements Command {

    private String description = "show - вывести все элементы коллекции в строковой форме";

    @Override
    public void execute(String arg) {
        if (App.getInstance().getCollectionManager().getCollection().isEmpty()) {
            System.out.println("Коллекция пуста как мой кошелек... ");
        }
        for (Flat flat: App.getInstance().getCollectionManager().getCollection()) {
            System.out.println(flat.toString());
        }
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
