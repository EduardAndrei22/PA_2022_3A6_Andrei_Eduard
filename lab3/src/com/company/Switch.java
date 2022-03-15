package com.company;

import javax.xml.stream.Location;
import java.util.Map;

public class Switch extends Node implements Identifiable{


    @Override
    public String toString() {
        return "Switch{" +
                "name='" + getName() + '\'' +
                "cost='" + getCost() + '\'' +
                '}';
    }



    public Switch(String name) {
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
