package org.example.model;

import java.io.Serializable;

public class Flat implements Serializable, Comparable<Flat> {
    private static Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.util.Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Long area; //Значение поля должно быть больше 0
    private Long numberOfRooms; //Поле может быть null, Значение поля должно быть больше 0
    private Boolean centralHeating; //Поле может быть null
    private Furnish furnish; //Поле может быть null
    private View view; //Поле может быть null
    private House house; //Поле может быть null

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public void setNumberOfRooms(Long numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setCentralHeating(Boolean centralHeating) {
        this.centralHeating = centralHeating;
    }

    public void setFurnish(Furnish furnish) {
        this.furnish = furnish;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public java.util.Date getCreationDate() {
        return creationDate;
    }

    public Long getArea() {
        return area;
    }

    public Long getNumberOfRooms() {
        return numberOfRooms;
    }

    public Boolean getCentralHeating() {
        return centralHeating;
    }

    public Furnish getFurnish() {
        return furnish;
    }

    public View getView() {
        return view;
    }

    public House getHouse() {
        return house;
    }

    @Override
    public int compareTo(Flat otherFlat) {
        return Long.compare(this.id, otherFlat.id);
    }
}