package com.company;

import javax.xml.stream.Location;
import java.util.Map;

public class Router extends Node implements Identifiable{
    private String address;

    @Override
    public String toString() {
        return "Router{" +
                "address='" + address + '\''+
                "name='" + getName() + '\'' +
                "cost='" + getCost() + '\'' +
                '}';
    }



    public Router(String name) {
        super(name);
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public int compareTo(Location o) {
        return 0;
    }
}
