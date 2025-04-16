package org.example.commands;

import org.example.App;
import org.example.CollectionManager;
import org.example.model.Flat;

public class RemoveByCHCommand implements Command {

    private String description = "remove_any_by_central_heating - удалить из коллекции один элемент, значение поля centralHeating которого эквивалентно заданному";

    @Override
    public void execute(String arg) {
        CollectionManager manager = App.getInstance().getCollectionManager();
        Boolean centralHeating = Boolean.parseBoolean(arg);
        if (arg.isEmpty()) {
            System.out.println("Вы не ввели аргумент команды)");
        } else {
            for (Flat flat : manager.getCollection()) {
                if (flat.getCentralHeating().equals(centralHeating)) {
                    manager.getCollection().remove(flat);
                    System.out.println("Квартира с отоплением=" + flat.getCentralHeating() + " удалена из коллекции ");
                    return;
                }
            }
            System.out.println("Кажется, квартиры с таким отоплением нет в коллекции( ");
        }
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
