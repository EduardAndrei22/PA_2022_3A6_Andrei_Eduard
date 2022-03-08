package com.company;

import javax.xml.stream.Location;
import java.util.Map;

public class Computer extends Node implements Identifiable, Storage {
    private String address;
    private int storageCapacity;


    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }



    @Override
    public String toString() {
        return "Computer{" +
                "address='" + address + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", name='" + getName() + '\'' +
                '}';
    }

    public Computer(String name) {
        super(name);
    }


    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getStorageCapacity() {
        return storageCapacity;
    }

    @Override
    public int compareTo(Location o) {
        return 0;
    }
}
