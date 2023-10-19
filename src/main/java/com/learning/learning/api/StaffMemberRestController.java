package com.learning.learning.api;

import com.learning.learning.models.StaffMember;
import com.learning.learning.services.StaffMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/staff-members")
public class StaffMemberRestController {
    private final StaffMemberService staffMemberService;

    public StaffMemberRestController(StaffMemberService staffMemberService) {
        this.staffMemberService = staffMemberService;
    }

    @GetMapping
    public ArrayList<StaffMember> staffMembers(){
        return staffMemberService.getAllStaffMember();
    }
}
