package com.learning.learning.models;

import jakarta.persistence.*;

/**
 * Model for Hotel Staff
 */
@Entity
@Table(name = "staff_member_table")
public class StaffMember {
    @Id
    @Column(name = "staff_member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String identification;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String position;

    public StaffMember(Long id, String identification, String firstName, String lastName, String position) {
        this.id = id;
        this.identification = identification;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public StaffMember() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return this.firstName + ' ' + this.lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
