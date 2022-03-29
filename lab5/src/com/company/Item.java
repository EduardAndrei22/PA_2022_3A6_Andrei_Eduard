package com.company;

import java.io.Serializable;

public class Item implements Serializable {
    private Integer id;
    private String name;
    private String location;
    private Integer entries=0;
    public Item(String name, String location, ItemType image) {
        this.id = entries++;
        this.name = name;
        this.location = location;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }




    @Override
    public String toString() {
        return   id + " " + name + " " + location;
    }
}