package org.example.commands;

import org.example.App;
import org.example.CollectionManager;
import org.example.model.Flat;

public class InfoCommand implements Command {

    private String description = "info - вывести информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)";

    @Override
    public void execute(String arg) {
        CollectionManager manager = App.getInstance().getCollectionManager();
        System.out.println("Тип коллекции: " + manager.getCollection().getClass().getSimpleName());
        System.out.println("Тип элементов коллекции: " + Flat.class.getSimpleName());
        System.out.println("Количество элементов коллекции: " + manager.getCollection().size());
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
