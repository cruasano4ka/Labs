package org.example;

import org.example.exceptions.*;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputReader {

    public static String readInput() {
        try {
            Scanner scanner = App.getInstance().getScanner();
            return scanner.nextLine().trim().toLowerCase();
        } catch (NoSuchElementException e) {
            throw new EOFInputException();
        }
    }
}
