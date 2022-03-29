package com.company;

import com.company.Item;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {


    private String name;
    private String path;
    private List<Item> items = new ArrayList<>();

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }


    public Catalog(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public void add(Item item) {
        items.add(item);
    }

    public void list() {
        items.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", items=" + items +
                '}';
    }

    public Item findById(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}

