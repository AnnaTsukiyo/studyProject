package com.example.studyproject.oop.delivery_printer;

import static java.lang.System.out;

public class DeliveryDetailsPrinter {

    private final Sorter sorter;

    public void printDetails() {
        sorter.sortDetails();
        out.println("Begin printing");
        out.println("End printing");
    }

    public DeliveryDetailsPrinter(Sorter sorter) {
        this.sorter = sorter;
    }
}
