package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private Boolean isWeekend;


    public Reservation(String roomType, int numberOfNights, Boolean isWeekend, int reservationTotal) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        if (roomType.equalsIgnoreCase("king")){
            this.price = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            this.price = 124.00;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public Boolean getWeekend() {
        return isWeekend;
    }

    public void setWeekend(Boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        double totalPrice = price * numberOfNights;
        if (isWeekend) {
            totalPrice += 1.1;
            // total price = total price + total price * (10/100)
        }
        return totalPrice;
    }
}
