package com.learning.learning.controllers;

import com.learning.learning.models.Room;
import com.learning.learning.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private RoomService roomService;
    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    @RequestMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }

}
