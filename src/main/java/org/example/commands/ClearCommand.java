package org.example.commands;

import org.example.App;
import org.example.model.Flat;

import java.util.PriorityQueue;

public class ClearCommand implements Command {

    private String description = "clear - очисить коллекцию";

    @Override
    public void execute(String arg) {
        App.getInstance().getCollectionManager().setCollection(new PriorityQueue<>());
        System.out.println("Коллекция была успешно очищена! ");
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "clear";
    }
}
