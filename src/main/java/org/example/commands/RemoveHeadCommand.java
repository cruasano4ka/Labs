package org.example.commands;

import org.example.App;
import org.example.model.Flat;

import java.util.PriorityQueue;

public class RemoveHeadCommand implements Command {

    private String description = "remove_head - вывести первый элемент коллекции и удалить его";

    @Override
    public void execute(String arg) {
        PriorityQueue<Flat> collection = App.getInstance().getCollectionManager().getCollection();
        if (collection.isEmpty()) {
            System.out.println("А выводить и удалять то нечего... ");
        } else {
            System.out.println("Первый член коллекции: " + collection.peek().toString());
            collection.remove();
            System.out.println("Успешно удален! ");
        }
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "remove_head";
    }
}
