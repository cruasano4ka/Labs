package org.example.commands;

import org.example.App;
import org.example.FlatBuilder;
import org.example.model.Flat;

public class AddCommand implements Command {

    private String description = "add - добавить новый элемент в коллекцию";

    @Override
    public void execute(String arg) {
        FlatBuilder flatBuilder = new FlatBuilder();
        flatBuilder.buildFlat();
        Flat flat = flatBuilder.getFlat();
        App.getInstance().getCollectionManager().getCollection().add(flat);
        System.out.println("Квартира с id " + flat.getId() + " была успешно создана!");
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
