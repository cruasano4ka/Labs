package org.example;

import org.example.commands.Command;

import java.util.*;

public class HistoryOfCommands {
    private final Deque<String> history = new ArrayDeque<>();
    private static final int MAX_HISTORY_SIZE = 14;

    // Добавление операции в историю
    public void add(Command command) {
        if (history.size() >= MAX_HISTORY_SIZE) {
            history.removeFirst(); // Удаляем самую старую операцию
        }
        history.addLast(command.getName()); // Добавляем новую
    }

    // Вывод истории операций
    public void printHistory() {
        System.out.println("=== Последние 14 команд ===");
        int counter = 1;
        for (String op : history) {
            System.out.println(counter++ + ") " + op);
        }
    }
}
