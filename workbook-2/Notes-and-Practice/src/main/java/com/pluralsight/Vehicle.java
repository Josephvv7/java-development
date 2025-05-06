package com.pluralsight;

public class Vehicle {
//    private long vehicleId;
    private String makeModel;
    private int carYear;
    private String color;
//    private int odometerReading;
//    private float price;


    public Vehicle(String makeModel, int carYear, String color) {
        this.makeModel = makeModel;
        this.carYear = carYear;
        this.color = color;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

