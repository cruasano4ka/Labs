package org.example.commands;

import org.example.App;
import org.example.InputReader;
import org.example.exceptions.SomeShityException;

import java.util.Scanner;

public class ExitCommand implements Command {

    private String description = "exit - завершить программу без сохранения коллекции в файл";

    @Override
    public void execute() {
        while (true) {
            try {
                System.out.println("Вы уверены что хотите выйти? (Y/N)");
                String answer = InputReader.readInput();
                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("Всего хорошего!");
                    System.exit(0);
                } else if (answer.equalsIgnoreCase("n")) {
                    System.out.println("оп оп, работаем дальше");
                    break;
                } else {
                    throw new IllegalArgumentException("Некорректный ввод. Введите Y/N");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (SomeShityException e) {}
        }
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return "exit";
    }
}
