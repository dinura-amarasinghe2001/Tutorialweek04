package com.Car;

public class Car {
    protected int NumDoor;
    protected String color;

    public Car(int numDoor, String color) {
        NumDoor = numDoor;
        this.color = color;
    }

    public int getNumDoor() {
        return NumDoor;
    }

    public void setNumDoor(int numDoor) {
        NumDoor = numDoor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
