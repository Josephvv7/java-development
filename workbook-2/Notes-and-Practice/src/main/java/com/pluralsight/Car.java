package com.pluralsight;

public class Car {
    private int speed;
    private String color;
    private String makeModel;

    public Car(int speed, String color, String makeModel) {
        this.speed = speed;
        this.color = color;
        this.makeModel = makeModel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }
}
