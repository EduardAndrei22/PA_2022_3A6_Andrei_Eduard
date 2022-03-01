package com.company;

public class Event {
    private String name;
    private int size;
    private int start_time;
    private int end_time;

    public Event() { }


    public Event(String name, int size, int start_time, int end_time) {
        this.name = name;
        this.size = size;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public Event(int size) {
        this.size = size;
    }

    public Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public int getEnd_time() {
        return end_time;
    }
    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                '}';
    }
}
