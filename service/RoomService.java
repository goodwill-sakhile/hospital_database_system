package com.hms.service;

import com.hms.model.Room;
import java.util.ArrayList;
import java.util.List;

/**
 * Service to manage hospital rooms.
 */
public class RoomService {
    private List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room added: " + room.getNumber());
    }

    public Room findRoom(String number) {
        for (Room room : rooms) {
            if (room.getNumber().equals(number)) {
                return room;
            }
        }
        return null;
    }

    public void setRoomOccupied(String number, boolean occupied) {
        Room room = findRoom(number);
        if (room != null) {
            room.setOccupied(occupied);
        }
    }

    public List<Room> getAllRooms() {
        return rooms;
    }
}
