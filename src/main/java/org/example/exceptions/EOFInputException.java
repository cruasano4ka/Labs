package org.example.exceptions;

public class EOFInputException extends RuntimeException {
    public EOFInputException() {
        super("Обнаружен EOF (Ctrl+D)");
    }
}