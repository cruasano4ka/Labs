package org.example.commands;

import org.example.App;
import org.example.FlatBuilder;
import org.example.model.Flat;

public class UpdateIdCommand implements Command {

    private String description = "update id {element} - обновить значение элемента коллекции, id которого равен заданному";

    @Override
    public void execute(String id) {

        if (App.getInstance().getCollectionManager().getCollection().isEmpty()){
            System.out.println("Нельзя обновить объект у пустой коллекции) ");
        } else {
            System.out.println("Вы изменяете квартиру с id " + id);
            App.getInstance().getCollectionManager().removeById(Long.parseLong(id));
            FlatBuilder builder = new FlatBuilder();
            builder.buildFlat();
            Flat flat = builder.getFlat();
            flat.setId(Long.parseLong(id));
            System.out.println("Данные квартиры с id " + id + " были успешно обновлены");
        }
    }


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "update";
    }
}
