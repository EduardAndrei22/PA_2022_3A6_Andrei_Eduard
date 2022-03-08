package com.company;

public class Room {
    protected String name;
    private int type;
    private int capacity;
    public enum RoomType {
        LECTURE_HALL,
        COMPUTER_LAB;
    }

    public Room(String name, int type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", capacity=" + capacity +
                '}';
    }
}
