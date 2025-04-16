package org.example.commands;

import org.example.App;
import org.example.FlatBuilder;
import org.example.model.Flat;

import java.util.PriorityQueue;

public class AddIfMaxCommand implements Command {

    private String description = "add_if_max {element} - добавить новый элемент в коллекцию, если его площадь превышает значение наибольшей площади элемента этой коллекции";

    @Override
    public void execute(String arg) {
        PriorityQueue<Flat> collection = new PriorityQueue<>();
        FlatBuilder flatBuilder = new FlatBuilder();
        flatBuilder.buildFlat();
        Flat flat = flatBuilder.getFlat();
        for (Flat f : App.getInstance().getCollectionManager().getCollection()) {
            if (f.getArea() < flat.getArea()) {
                collection.add(f);
            }
        }
        if (collection.size() == App.getInstance().getCollectionManager().getCollection().size()) {
            collection.add(flat);
            App.getInstance().getCollectionManager().setCollection(collection);
            System.out.println("Элемент с площадью " + flat.getArea() + " успешно добавлен в коллекцию ");
        }
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "add_if_max";
    }
}
