package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private Boolean isOccupied;
    private Boolean isDirty;


    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public Boolean isOccupied() {
        return isOccupied;
    }

    public Boolean isDirty() {
        return isDirty;
    }

    public Boolean getAvailable() {
        // Derived getter
        /*return isAvailable;*/
        return !isOccupied && !isDirty;
    }

    public void checkIn() {
        if (!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
        }
    }
    public void checkOut() {
        isOccupied = false;
    }

    public void cleanRoom() {
        if (!isOccupied) {
            isDirty = false;
        }
    }
}

