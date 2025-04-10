package org.example.commands;

import org.example.InputReader;
import org.example.exceptions.EOFInputException;

public class ExitCommand implements Command {

    private String description = "exit - завершить программу без сохранения коллекции в файл";

    @Override
    public void execute() {
        int maxAttempts = 5; // Максимальное количество попыток
        int attempts = 0;

        while (attempts < maxAttempts) {
            try {
                System.out.println("Вы уверены, что хотите выйти? (Y/N)");
                String answer = InputReader.readInput().trim().toLowerCase();

                if (answer.equals("y")) {
                    System.out.println("Всего хорошего!");
                    System.exit(0);
                } else if (answer.equals("n")) {
                    System.out.println("Продолжаем работу!");
                    return; // Выход из команды
                } else {
                    throw new IllegalArgumentException("Некорректный ввод. Введите Y или N.");
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                attempts++;

            } catch (EOFInputException e) {
                System.out.println(e.getMessage());
                // Не увеличиваем attempts при Ctrl+D
            }
        }

        System.out.println("Слишком много некорректных попыток. Возврат в главное меню.");
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