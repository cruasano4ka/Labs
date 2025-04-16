package org.example;

import org.example.exceptions.NoSuchCommandException;
import org.example.exceptions.EOFInputException;

import java.util.Scanner;

public class App {

    private App() {
    }

    private static App app;

    private CollectionManager collectionManager;
    private CommandManager commandManager;
    private Scanner scanner;
    private HistoryOfCommands history;

    public static App getInstance() {
        if (app == null) {
            app = new App();
        }
        return app;
    }



    public void setCollectionManager(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public void setCommandManager(CommandManager commandManager) {
        this.commandManager = commandManager;
    }

    public CollectionManager getCollectionManager() {
        return collectionManager;
    }

    public CommandManager getCommandManager() {
        return commandManager;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public HistoryOfCommands getHistory() {
        return history;
    }

    public void setHistory(HistoryOfCommands history) {
        this.history = history;
    }

    public void runApp() {
        System.out.println("Wazaaa. Введите help для получения списка команд");

        while (true) {
            try {
                System.out.print("Введите название команды: ");
                String[] input = InputReader.readInput().split(" ", 2);
                String arg = "";
                if (input.length > 1) {
                    arg = input[1];
                }
                commandManager.getCommandByKey(input[0]).execute(arg);
                history.add(commandManager.getCommandByKey(input[0]));
            } catch (NoSuchCommandException e) {
                System.out.println("Кажется, такой команды не суествует! ");
            } catch (EOFInputException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            } catch (Exception e) {
                System.out.println("Ошибочка: " + e.getMessage());
                System.exit(0);
            }

        }
    }
}
