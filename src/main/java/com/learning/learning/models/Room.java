package com.learning.learning.models;

public class Room {
    private long id;
    private String number;
    private String name;
    private String info;

    public Room(long id, String name, String number, String info) {
        this.id = id;
        this.name = name;
        this.number = number;

        this.info = info;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
