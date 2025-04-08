package org.example;

import org.example.model.Coordinates;

import java.util.Scanner;

public class CoordinatesBuilder {

    private Coordinates coordinates;
    Scanner scanner = App.getInstance().getScanner();

    public CoordinatesBuilder() {
        coordinates = new Coordinates();
    }

    public void setX(float x) {
         coordinates.setX(x);
    }

    public void setY(Integer y) {
        coordinates.setY(y);
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
}
