package com.company;

public interface Storage {
    int getStorageCapacity();
    public default int StorageCapcaciy_inMB(int getStorageCapacity)
    {

        return getStorageCapacity*1000;
    }
    public default int StorageCapcaciy_inKB(int getStorageCapacity)
    {

        return getStorageCapacity*1000000;
    }
    public default int StorageCapcaciy_inB(int getStorageCapacity)
    {

        return getStorageCapacity*1000000000;
    }
}
