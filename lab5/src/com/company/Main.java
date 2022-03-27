package com.company;

import com.company.Catalog;
import com.company.Item;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws InvalidCatalogException, IOException {
        Main app = new Main();
        app.testCreateSave();
        app.testLoadView();
    }

    private void testCreateSave() throws IOException {
        Catalog catalog =
                new Catalog("MyRefs","C:\\Users\\Edi Andrei\\Desktop\\facultate\\PA_2022\\Test");
        var book = new Item("book","C:\\Users\\Edi Andrei\\Desktop\\facultate\\PA_2022\\utility_PA\\book.png" );
        catalog.add(book);


        catalog.save( "C:\\Users\\Edi Andrei\\Desktop\\facultate\\PA_2022\\Test");
    }

    private void testLoadView() throws InvalidCatalogException {
        Catalog catalog = CatalogUtil.load("C:\\Users\\Edi Andrei\\Desktop\\facultate\\PA_2022\\Test");
        CatalogUtil.view(catalog.findById("book"));
    }
}

