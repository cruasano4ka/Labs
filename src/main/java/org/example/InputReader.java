package org.example;

import org.example.exceptions.*;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputReader {

    public static String readInput() {
        try {
            Scanner scanner = App.getInstance().getScanner();
            return scanner.nextLine().trim();
        } catch (NoSuchElementException e) {
            App.getInstance().setScanner(new Scanner(System.in));
            throw new EOFInputException();
        }
    }
}
