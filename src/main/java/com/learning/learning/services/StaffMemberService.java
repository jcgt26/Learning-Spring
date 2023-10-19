package com.learning.learning.services;

import com.learning.learning.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StaffMemberService {
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

    public ArrayList<StaffMember> getAllStaffMember(){
        return staffMembers;
    }
}
