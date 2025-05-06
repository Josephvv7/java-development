package com.pluralsight;

public class HotelOperationsApp {
    public static void main(String[] args) {
        Room room = new Room(2, 100.00);

        room.checkIn();
        System.out.println("Room is occupied: " + room.isOccupied());
        System.out.println("Room is dirty: " + room.isDirty());

        room.checkOut();
        System.out.println("Room is occupied: " + room.isOccupied());
        room.cleanRoom();
        System.out.println("Room is dirty: " + room.isDirty());

        Employee employee = new Employee();
        employee.punchIn(10.0);

        employee.punchOut(17.5);
        System.out.println("Hours worked: " + employee.getHoursWorked());
        System.out.println("Total Pay: " + employee.getTotalPay());
        System.out.println("Regular");










    }
}
