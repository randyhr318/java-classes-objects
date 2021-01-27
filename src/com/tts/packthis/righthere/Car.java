package com.tts.packthis.righthere;

    //Create a Custom Class (anything you want - car, phone, holiday, etc.).
public class Car {

    // Minimum 3 private instance variables
    private String color;
    private int numWheels;
    private int numberOfDoors;
    private boolean doorJamb;

    //An empty constructor
    public Car() {
    }

    //A constructor that uses only 2 of your 3 variables

    public Car(String color, int numWheels) {
        this.color = color;
        this.numWheels = numWheels;
    }

    //A constructor that uses all 3 of your instance variables
    public Car(String color, int numWheels, int numberOfDoors) {
        this.color = color;
        this.numWheels = numWheels;
        this.numberOfDoors = numberOfDoors;
    }

    //Getters and Setters for all 3 of your instance variables

    //Getters
    public String getColor() {
        return color;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    //Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    //Override
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", numWheels=" + numWheels +
                ", numberOfDoors=" + numberOfDoors +
                '}';

    }

    //A method that returns a Boolean
    public boolean doorJamb() {
        return numberOfDoors >= 4;
    }
}
