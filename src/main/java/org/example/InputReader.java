package org.example;

import org.example.exceptions.SomeShityException;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputReader {

    public static String readInput() throws SomeShityException {
        try {
            Scanner scanner = App.getInstance().getScanner();
            String input = scanner.nextLine();
            return input;
        } catch (NoSuchElementException e) {
            throw new SomeShityException();
        }
    }
}
