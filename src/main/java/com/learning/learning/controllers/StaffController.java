package com.learning.learning.controllers;

import com.learning.learning.models.Room;
import com.learning.learning.models.StaffMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private static ArrayList<StaffMember> staffMembers = new ArrayList<>();


    static {
        for (int i = 0; i < 10; i++) {
            staffMembers.add(
                    new StaffMember(
                            Integer.toUnsignedLong(i),
                            Long.toString(i),
                            "First Name " + i,
                            "Last Name " + i,
                            "Front door "));
        }
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("staffMembers",staffMembers);

        return "staff";
    }

}
