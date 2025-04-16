package org.example.commands;

import org.example.App;
import org.example.CollectionManager;
import org.example.HistoryOfCommands;

public class HistoryCommand implements Command {

    private String description = "history - вывести последние 14 команд (без их аргументов)";

    @Override
    public void execute(String arg) {
        HistoryOfCommands history = App.getInstance().getHistory();
        if (history == null) {
            System.out.println("История пуста ");
        } else {
            history.printHistory();
        }
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "history";
    }
}
