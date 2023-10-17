package com.learning.learning.controllers;

import com.learning.learning.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private static final List<Room> rooms = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room(i, "Room", "R"+ i, "this is a room with id:" + i));
        }
    }
    @RequestMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms", rooms);
        return "rooms";
    }

}
