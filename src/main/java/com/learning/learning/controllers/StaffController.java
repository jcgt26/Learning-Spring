package com.learning.learning.controllers;

import com.learning.learning.services.StaffMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class StaffController {
    private StaffMemberService staffMemberService;

    @Autowired
    public StaffController(StaffMemberService staffMemberService) {

        this.staffMemberService = staffMemberService;
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("staffMembers", staffMemberService.getAllStaffMember());

        return "staff";
    }

}
