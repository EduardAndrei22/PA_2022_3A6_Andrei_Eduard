package com.company;

import java.io.IOException;

import static com.company.CatalogUtil.load;
import static com.company.CatalogUtil.save;

public class Main {
    public static void main(String args[]) throws InvalidCatalogException, IOException {
        Item myItem= new Image("book","C:\\Users\\Edi Andrei\\Desktop\\facultate\\PA_2022\\utility_PA\\book.png");
        Catalog catalog =
                new Catalog("MyRefs","C:\\Users\\Edi Andrei\\Desktop\\facultate\\PA_2022\\Test");
        catalog.add(myItem);
        save( catalog);
        Catalog otherCatalog;
        otherCatalog = load("C:\\Users\\Edi Andrei\\Desktop\\facultate\\PA_2022\\Test\\MyRefs");
        otherCatalog.list();

    }
}

