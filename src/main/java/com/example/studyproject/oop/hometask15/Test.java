package com.example.studyproject.oop.hometask15;

public class Test {

    public static void main(String[] args) {
        Weekday weekday = Weekday.MONDAY;

        if (weekday.isWeekDay(weekday)) {
            System.out.println("Weekday is a working day");
        } else if (weekday.isWeekEnd(weekday)) {
            System.out.println("Weekday is a holiday");
        }
    }
}
