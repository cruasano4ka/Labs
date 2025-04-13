package org.example.model;

public class Coordinates {
    private float x;
    private Integer y; // поле не модет быть null

    public void setX(float x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    @Override
    public String toString() {
        return "[x=" + x + ", y=" + y + "]";
    }
}
