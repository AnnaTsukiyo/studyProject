package com.example.studyproject.oop.delivery_printer;

/**
 * Complexity Level 1:
 * Let's say we want to create a DeliveryDetailsPrinter object that should print the details of the packages handled by the delivery application.
 * This information must be ordered by destination address.
 * Develop an appropriate class(es)
 * (hint: the entity that prints the information should delegate the responsibility of sorting packages by delivery address to another entity)
 */

public class Main {

    public static void main(String[] args) {

        DeliveryDetailsPrinter printerByAddress = new DeliveryDetailsPrinter(new SortedByAddress());
        printerByAddress.printDetails();

        DeliveryDetailsPrinter printerByName = new DeliveryDetailsPrinter(new SorterByName());
        printerByName.printDetails();
    }
}
