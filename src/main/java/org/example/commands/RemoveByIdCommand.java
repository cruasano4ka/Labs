package org.example.commands;

import org.example.App;

public class RemoveByIdCommand implements Command {

    private String description = "remove_by_id id - удалить элемент из коллекции по его id";

    @Override
    public void execute(String id) {
        try {
            App.getInstance().getCollectionManager().removeById(Long.parseLong(id));
            System.out.println("Квартира с индексом " + id + " успешно удалена ");
        } catch (NumberFormatException|NullPointerException e) {
            System.out.println("Введенный id таковым не является или не существует ");
        }

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "remove_by_id";
    }
}
