package com.example.studyproject.core;

import java.util.Scanner;

/**
 * Hometask5
 * First level: 1 task;
 * Second level: 1 task ;
 */

public class Hometask5 {

    public static void main(String[] args) {
        checkPersonAge(15, 18); //Level 1 Task1
        printMaxNumber(); // Level 2 Task2
    }

    /**
     * First level:
     * Task1
     * Imagine, you are writing the program for cinema.
     * The method you should create takes two arguments.
     * The first is the age of the person;
     * the second is an age limit of the film.
     * The method should print if this film allowed for the person or not
     */

    private static void checkPersonAge(int personAge, int filmAgeLimit) {
        if (personAge < filmAgeLimit) {
            System.out.println("You are not allowed to watch this film!");
        } else {
            System.out.println("You are allowed to watch this film!");
        }
    }

    /**
     * Second level:
     * Task1
     * Implement the program that ask user to input three integers (use Scanner),
     * and print the maximum of three numbers. 19,10,1 ->19
     **/

    private static void printMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }
    }
}