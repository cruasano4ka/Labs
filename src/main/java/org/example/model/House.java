package org.example.model;

public class House {
    private String name; //Поле не может быть null
    private Integer year; //Максимальное значение поля: 277, Значение поля должно быть больше 0
    private Long numberOfLifts; //Значение поля должно быть больше 0

    public void setName (String name) {
        this.name = name;
    }

    public void setYear (Integer year) {
        this.year = year;
    }

    public void setNumberOfLifts (Long numberOfLifts) {
        this.numberOfLifts = numberOfLifts;
    }
}
