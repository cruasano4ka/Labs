package org.example;

import org.example.model.Coordinates;
import org.example.model.Flat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FlatBuilder {

    public Flat buildFlat() {
        Flat flat = new Flat();
        flat.setName(inputName());
        flat.setCoordinates(inputCoordinates());
//        flat.setArea();
//        flat.setNumberOfRooms();
//        flat.setCentralHeating();
//        flat.setFurnish();
//        flat.setView();
//        flat.setHouse();
        return flat;
    }

    public String inputName() {
        System.out.print("Введите название квартиры:");
        Scanner scanner = App.getInstance().getScanner();
        String name = scanner.nextLine().trim();
        while (name == null || name.isEmpty()) {
            System.out.println("Ошибка: название не может быть null/пустой строкой");
            name = scanner.nextLine().trim();
        }
        return name;
    }

    public Coordinates inputCoordinates() {
        try {
            Scanner scanner = App.getInstance().getScanner();
            Coordinates coordinates = new Coordinates();
            System.out.println("Введите координату квартиры по Х: ");
            float x = scanner.nextFloat();
            coordinates.setX(x);

            System.out.println("Введите координату квартиры по Y: ");
            Integer y = scanner.nextInt();
            coordinates.setY(y);

            return coordinates;
        } catch (InputMismatchException e) {
            System.out.println("Ошибка формата вввода: " + e.getMessage());
            return inputCoordinates();
        }
    }


}
