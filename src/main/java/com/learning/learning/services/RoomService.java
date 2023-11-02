package com.learning.learning.services;

import com.learning.learning.data.RoomRepository;
import com.learning.learning.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
//    private static final ArrayList<Room> rooms = new ArrayList<>();
    private final RoomRepository roomRepository;

//    static {
//        for (int i = 0; i < 10; i++) {
//            rooms.add(new Room(i, "Room", "R"+ i, "this is a room with id:" + i));
//        }
//    }

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return this.roomRepository.findAll();
    }
}
