package org.example;

import org.example.exceptions.NoSuchCommandException;
import org.example.exceptions.SomeShityException;

import java.util.Scanner;

public class App {

    private App() {
    }

    private static App app;

    CollectionManager collectionManager;
    CommandManager commandManager;
    Scanner scanner;

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

    public void runApp() throws NoSuchCommandException, SomeShityException {
        while (true) {
            try {
                String command = InputReader.readInput();
                commandManager.getCommandByKey(command).execute();
            } catch (NoSuchCommandException e) {
                System.out.println("Кажется, такой команды не суествует!");
            } catch (SomeShityException e) {

            }

        }
    }
}
