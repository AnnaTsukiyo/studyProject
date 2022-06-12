package com.example.studyproject;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Hometask6
 * First level: 3 tasks;
 * Second level: 1 task ;
 */

public class Hometask6 {
    public static void main(String[] args) {

        getMonthString();// Level 1 Task 1
        getSeasonString(); // Level 1 Task 2
        printPurchaseAmount(); //Level 1 Task3
        printMaxNumber();//Level 2 Task 1
    }

    /**
     * First level:
     * Task1
     * Implement the program that takes the integer from Scanner – the number of day of month.
     * Implement the method that takes this integer and returns the String the month or message: “illegal argument”.
     * Example: getMonthString(3) -> March;
     **/

    private static String getMonthString() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the month as an integer");
        int monthNumber = scanner.nextInt();
        String month = switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Illegal argument";
        };
        System.out.println(month);
        return month;
    }

    /**
     * First level:
     * Task2
     * Implement the method that takes the month number and returns the season
     * (winter, spring, summer or autumn) to which the month belongs.
     **/

    private static String getSeasonString() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the month as an integer");
        int number = scanner.nextInt();
        String season = switch (number) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Illegal argument";
        };
        System.out.println(season);
        return season;
    }

    /**
     * First level
     * Task3
     * Imagine you are writing a program for a store.
     * It should announce the promotion condition: ” You can get the BestWowSomething by the price 89.99$.
     * But if you buy two articles then you get the discount 10% of all
     * and if you buy three and more the discount will be 15% of all”.
     * Then It should ask the user how many articles user wants to buy.
     * If the user input something more than 0 the program should print the amount of purchase,
     * else displays “It's a pity. See you next time”
     **/

    private static void printPurchaseAmount() {

        System.out.println("Hello, dear user! You can get the BestWowSomething by the price 89.99$!");
        System.out.println("But if you buy two articles then you get the discount 10% of all and if you buy three and more the discount will be 15% of all");
        System.out.println("How many articles would you like to buy?");
        Scanner scanner = new Scanner(System.in);
        int articlesAmount = scanner.nextInt();
        double amount;
        DecimalFormat df = new DecimalFormat("###.##");
        if (articlesAmount == 1) {
            amount = 89.99;
            System.out.printf("The amount of purchase is %s$%n", df.format(amount));
        } else if (articlesAmount == 2) {
            amount = (89.99 * 2) - ((89.99 * 2) * 0.1);
            System.out.printf("The amount of purchase is %s$%n", df.format(amount));
        } else if (articlesAmount >= 3) {
            amount = (89.99 * articlesAmount) - ((89.99 * articlesAmount) * 0.15);
            System.out.printf("The amount of purchase is %s$%n", df.format(amount));
        } else {
            System.out.println("It's a pity. See you next time!");
        }
    }

    /**
     * Second level:
     * Task1
     * Implement the program that ask user to input three integers (use Scanner),
     * and print the maximum of three numbers. Implements this by using ternary operator: 19,10,1 ->19
     **/
    private static void printMaxNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number");
        int number3 = scanner.nextInt();

        int max = (number1 > number2) ?
                (number1 > number3 ? number1 : number3) :
                (number2 > number3 ? number2 : number3);
        System.out.printf("The maximum of the given three numbers is %d%n", max);

    }
}
