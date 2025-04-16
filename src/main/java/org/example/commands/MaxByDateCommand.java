package org.example.commands;

import org.example.App;
import org.example.CollectionManager;
import org.example.model.Flat;

public class MaxByDateCommand implements Command {

    private String description = "max_by_creation_date - выводит самый старый объект в коллекции";

    @Override
    public void execute(String arg) {
        CollectionManager manager = App.getInstance().getCollectionManager();
        if (manager.getCollection().isEmpty()) {
            System.out.println("Коллекция пуста и выводить нечего) ");
        } else {
            Flat elderFlat = manager.getCollection().peek();
            for (Flat flat : manager.getCollection()) {
                if (flat.getCreationDate().toInstant().isBefore(elderFlat.getCreationDate().toInstant())) {
                    elderFlat = flat;
                }
            }
            System.out.println("Самый старый элемент коллекции: " + elderFlat.toString());
        }

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "max_by_date";
    }
}
