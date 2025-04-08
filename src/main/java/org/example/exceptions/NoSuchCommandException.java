package org.example.exceptions;

public class NoSuchCommandException extends RuntimeException {
    public NoSuchCommandException(String commandName) {
        super("Нет такой коианды: " + commandName);
    }
}
