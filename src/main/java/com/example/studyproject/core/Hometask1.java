package com.example.studyproject.core;

import java.util.Scanner;

/**
 * Hometask1
 * First level: 1: 4 tasks;
 * Second level: 1 task;
 */

public class Hometask1 {

    public static void main(String[] args) {
        displayNumbersSumAndSubtraction(); //Task1
        rectangleAreaCalculation(); //Task2
        displayActionsWithTwoNumbers(); //Task3
        circleAreaCalculation(); //Task4
        calculateExtraCalories(); // Second level: Task1
    }

    /**
     * Task 1
     * Write a program that obtains two integers from user and displays its sum and subtraction
     */

    public static void displayNumbersSumAndSubtraction() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.printf("number1=%d   number2=%d%n", number1, number2);
        int sum = number1 + number2;
        int subtraction = number1 - number2;
        System.out.printf("%d+%d=%d", number1, number2, sum);
        System.out.printf("%n%d-%d=%d", number1, number2, subtraction);
    }

    /**
     * Task2
     * Write a program that obtains two integers from user (the sides of rectangle) and then displays:
     * “The area of the rectangle with side 1 = ….  and side 2 =…… is ……” and the result calculated using the formula side1*side2
     */

    public static void rectangleAreaCalculation() {
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        System.out.printf("The area of the rectangle with side 1 = %d and side 2 = %d is %d%n", side1, side2, side1 * side2);
    }

    /**
     * Task3
     * Write a program that obtains two integers from user and displays (for 12 and 3):
     * 12+3=15
     * 12-3=9
     */

    public static void displayActionsWithTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        System.out.printf("%d+%d=%d%n", firstNumber, secondNumber, sum);
        System.out.printf("%d-%d=%d%n", firstNumber, secondNumber, subtraction);
    }

    /**
     * Task4
     * Write a program that obtains a radius from user and then displays:
     * “The area of a circle with radius …” and the result calculated using the formula 3.14rr
     */

    public static void circleAreaCalculation() {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        int areaOfCircle = (int) (Math.PI * radius * radius);
        System.out.printf("The area of a circle with radius %d is %d%n", radius, areaOfCircle);
    }

    /**
     * Second level: 5
     * Write a program that calculates how many extra calories there will be if you’ll buy a pizza with a diameter of 28 cm instead of a pizza with a diameter of 24 cm.To solve this, let's assume that each square centimeter of pizza is 40 calories.
     */

    public static void calculateExtraCalories() {
        int squareCentCalories = 40;
        System.out.printf("There will be %d extra calories if you buy a 28 cm diameter pizza instead of 24 cm diameter pizza.%n", 28 * squareCentCalories - 24 * squareCentCalories);
    }
}
