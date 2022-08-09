package com.example.studyproject.core;

/**
 * Hometask3
 * First level: 3 tasks;
 * Second level: 1 task ;
 */

public class Hometask4 {
    public static void main(String[] args) {
        boolean canWalk = canWalkOut();
        System.out.printf("You can walk, it's %s%n", canWalk); //task1
        boolean canBuyFood = canBuy();
        System.out.printf("I can buy the food, it’s %s%n", canBuyFood);//task2
        boolean isWorking = deviceIsWorking();
        System.out.printf("Device is working, it's %s%n", isWorking); //task3
        System.out.printf("The given year is leap, it's %s%n", isLeapYear(2022)); //2nd level
    }

    /**
     * Task1
     * Create two variables isWeekend and isRain.
     * Create the variable canWalk whose value should be true if it's a day off (isWeekend=true)
     * and it's not raining (isRain=false).
     */

    private static boolean canWalkOut() {
        boolean isWeekend = true, isRain = false;
        if (isWeekend && !isRain) {
            return true;
        }
        return false;
    }

    /**
     * Task2
     * Create two variables isEdekaOpen and isReweOpen, the values of which depend on the fact if the stores open or not.
     * Implements a method boolean canBuy, that returns true
     * The value of this variable must be true if at least one store is open,otherwise false.
     * Display the string “I can buy the food It’s ……“ and the value.
     */

    private static boolean canBuy() {
        boolean isEdekaOpen = true, isReweOpen = false;
        if (isEdekaOpen | isReweOpen) {
            return true;
        }
        return false;
    }

    /**
     * Task3
     * Let’s imagine that we have a device, which has two flasks.
     * The device works correct if temperature of the first flask is above 100 degrees and the temperature
     * of the second flask is less than 100 degree. You should write the method that checks this device.
     * Your program has to variables temperature1 and temperature2. As a result it prints the message true or false.
     */

    private static boolean deviceIsWorking() {
        boolean isWorking = false;
        int temperature1 = 102, temperature2 = 99;
        if (temperature1 > 100 && temperature2 < 100) {
            return isWorking == true;
        }
        return isWorking;
    }

    /**
     * Second level:
     * Write a method that takes a year number as a parameter and returns true
     * if the year is a leap year and false if the year is not a leap year.
     */

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}
