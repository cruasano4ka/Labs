package org.example;

import org.example.commands.*;
import org.example.model.Flat;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        App app = App.getInstance();
        app.setCommandManager(new CommandManager());
        app.setCollectionManager(new CollectionManager());
        app.getCollectionManager().setCollection(new PriorityQueue<Flat>());
        app.setScanner(new Scanner(System.in));
        app.getCommandManager().addCommand("help", new HelpCommand());
        app.getCommandManager().addCommand("add", new AddCommand());
        app.getCommandManager().addCommand("add_if_max", new AddIfMaxCommand());
        app.getCommandManager().addCommand("clear", new ClearCommand());
        app.getCommandManager().addCommand("execute", new ExecuteCommand());
        app.getCommandManager().addCommand("exit", new ExitCommand());
        app.getCommandManager().addCommand("history", new HistoryCommand());
        app.getCommandManager().addCommand("info", new InfoCommand());
        app.getCommandManager().addCommand("max_by_date", new MaxByDateCommand());
        app.getCommandManager().addCommand("print_unique_central_heating", new PrintUniqueCHCommand());
        app.getCommandManager().addCommand("remove_any_by_central_heating", new RemoveByCHCommand());
        app.getCommandManager().addCommand("remove_by_id", new RemoveByIdCommand());
        app.getCommandManager().addCommand("remove_head", new RemoveHeadCommand());
        app.getCommandManager().addCommand("save", new SaveCommmand());
        app.getCommandManager().addCommand("show", new ShowCommand());
        app.getCommandManager().addCommand("update", new UpdateIdCommand());
        app.runApp();


    }
}
