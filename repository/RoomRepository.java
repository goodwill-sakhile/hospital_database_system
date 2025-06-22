package com.hms.repository;

import com.hms.model.Room;
import java.util.ArrayList;
import java.util.List;

/**
 * Stores and retrieves hospital room data.
 */
public class RoomRepository {
    private final List<Room> rooms = new ArrayList<>();

    public void save(Room room) {
        rooms.add(room);
    }

    public Room findByNumber(String number) {
        for (Room r : rooms) {
            if (r.getNumber().equals(number)) {
                return r;
            }
        }
        return null;
    }

    public List<Room> findAll() {
        return new ArrayList<>(rooms);
    }

    public void delete(String number) {
        rooms.removeIf(r -> r.getNumber().equals(number));
    }
}
