package com.geekster.getMapping.MyObject;

public class Car {
    private String colour;

    public Car(String colour) {
        this.colour = colour;
        System.out.println("method called");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
