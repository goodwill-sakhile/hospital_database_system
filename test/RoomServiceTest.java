package com.hms.test;

import com.hms.model.Room;
import com.hms.service.RoomService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomServiceTest {

    @Test
    void testRoomOccupancy() {
        RoomService service = new RoomService();
        Room r = new Room("R101", "ICU", false);
        service.addRoom(r);

        assertFalse(service.findRoom("R101").isOccupied());
        service.setRoomOccupied("R101", true);
        assertTrue(service.findRoom("R101").isOccupied());
    }
}
