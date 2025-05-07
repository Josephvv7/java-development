package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class RoomTest {

    @Test
    public void checkIn_IfNotOccupiedAndIsDirty_SetBothToTrue() {
        // arrange
        Room room = new Room(1, 200);

        // act
        room.checkIn();

        // assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkout_RoomIsOccupied_ShouldBeNotOccupied() {
        // arrange
        Room room = new Room(2, 75);
        room.checkIn();

        // act
        room.checkout();

        // assert
        assertFalse(room.isOccupied());
    }

    @Test
    public void cleanRoom_RoomWasUsed_RoomIsNotOccupied() {
        // arrange
        Room room = new Room(3, 100);
        room.checkIn();
        room.checkout();

        // act
        room.checkIn();

        // assert
        assertFalse(room.isOccupied());
    }
}
