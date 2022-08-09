package com.example.studyproject.core;

import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * Hometask3
 * First level: 5 tasks;
 * Second level: 1 task ;
 */

public class Hometask3 {

    public static void main(String[] args) {
        int a = 270;
        int b = 540;
        int c = 34;
        int d = 42;
        String name = "Ariadna";
        evaluatesExpression(a, b, c, d); //Task1
        printGreeting(name); //Task2
        convertEurToUsd(a); //Task3
        calculateExtraCalories(c); //Task4
        additionOfTwoNumbers(a, b);// Task5 addition
        subtractionOfTwoNumbers(a, b);// Task5 subtraction
        multiplicationOfTwoNumbers(a, b);// Task5 multiplication
        divisionOfTwoNumbers(a, b);// Task5    division
        printRoundedNumber();// Second level
    }

    /**
     * Task1
     * Write a method that evaluates the expression a * (b + (c / d))
     * and returns the result, where a, b, c, d are integer inputs to this method.
     */
    public static void evaluatesExpression(int a, int b, int c, int d) {
        int expressionResult = (a * (b + (c / d)));
        System.out.printf("a * (b + (c / d)) = %s%n", expressionResult);
    }

    /**
     * Task2
     * Write a method that takes a string representing the name as a parameter.
     * The method should return a greeting message: "Hello, passed_name!".
     * Print the greeting to the console.
     */
    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    /**
     * Task3
     * Implement the method that convert the given amount in EUR to amount in USD
     */
    public static void convertEurToUsd(double amountInEuro) {
        int aux = (int)(amountInEuro * 1.0697 *100);
        double result =  aux/100d;
        System.out.println("The given amount in EUR (" + amountInEuro + ") is equal to " + result+ " USD with conversion rate: 1 EUR =  1.0697 USD.");
    }

    /**
     * Task4
     * Implement the method that calculates how many extra calories there will be
     * if you’ll buy a pizza with a diameter of n cm (parameter of method) instead of a pizza with a diameter of 24 cm.
     * To solve this, let's assume that each square centimeter of pizza is 40 calories.
     **/
    public static void calculateExtraCalories(int anotherPizzaDiameter) {
        int squareCentCalories = 40;
        double extraCalories = (double) (anotherPizzaDiameter - 24) * squareCentCalories;
        System.out.print("There will be " + extraCalories + " extra calories if you buy a " + anotherPizzaDiameter + " cm diameter pizza instead of 24 cm diameter pizza.");

    }

    /**
     * Task5
     * Implement the program that prints to screen the results of addition, subtraction, multiplication and division of two numbers.
     * Each of the arithmetic operations should be implemented as a separate method.
     */
    public static void additionOfTwoNumbers(int a, int b) {
        System.out.println("The results of addition of the given a and b numbers is " + (a + b));
    }

    public static void subtractionOfTwoNumbers(int a, int b) {
        System.out.println("The results of subtraction of the given a and b numbers is " + (a - b));
    }

    public static void multiplicationOfTwoNumbers(int a, int b) {
        System.out.println("The results of multiplication of the given a and b numbers is " + (a * b));
    }

    public static void divisionOfTwoNumbers(int a, int b) {
        System.out.println("The results of division of the given a and b numbers is " + (double)a / b);
    }
    /**
     * Second level:
     * Write a method that assigns a random value from a floating point range to the variable a
     * and outputs the value rounded to 3 decimal places.
     */

    public static void printRoundedNumber(){
        Random r = new SecureRandom();
        double a = r.nextDouble();
        System.out.println("A random value of a is "+ a);
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("Rounded value is " + df.format(a));
    }
}