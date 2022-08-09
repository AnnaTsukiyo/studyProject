package com.example.studyproject.core;

import java.util.Scanner;

/**
 * Hometask7
 * First level: 4 tasks;
 * Second level: 1 task ;
 */

public class Hometask7 {

    public static void main(String[] args) {
        countdown();// Level 1 Task1
        getSumDivisibleByTreeNumbers(20, 10); // Level 1 Task2
        printInputIntegersSum(); // Level 1 Task3
        getQuantityOfLeapYears(2000, 2022);
        isPrimeNumber(29);//Level 2 Task 1
    }

    /**
     * First level:
     * Task1
     * Implement method “countdown” that prints numbers from 5 to 1, then prints „start“.
     * Implement it using both type of loop
     * countdown() -> 5 4 3 2 1 Start
     */

    private static void countdown() {
        int number = 5;
        do {
            System.out.println(number);
            number--;
        } while (number > 0);
        System.out.println("Start");
    }


    /**
     * First level:
     * Task2
     * Given two integers number1 and number2.
     * Implement method that returns the sum of all numbers between number1 and number2 that divisible by 3.
     * Example: getSumDivisibleByTreeNumbers(20,10) -> 45
     */

    private static int getSumDivisibleByTreeNumbers(int number1, int number2) {
        int temp, sum = 0;

        if (number1 > number2) {
            temp = number2;
            number2 = number1;
            number1 = temp;
        }

        for (int i = number1; i <= number2; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    /**
     * First level:
     * Task3
     * Implement the program that read Integers from Scanner and prints the sum of all integers were input.
     * The program will finish when 0 input
     */

    private static void printInputIntegersSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integers one by one ,then input 0 to finish");
        int input;
        int sum = 0;
        do {
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);
        System.out.println(sum);
    }

    /**
     * First level:
     * Task4
     * Given two integers year1 and year2.
     * Implement method that returns the quantity of leap years between year1 and year2.
     * Example: getQuantityOfLeapYears (2000,2022) -> 6
     */
    private static int getQuantityOfLeapYears(int year1, int year2) {
        int temp, count = 0;

        if (year1 > year2) {
            temp = year2;
            year2 = year1;
            year1 = temp;
        }

        for (int i = year1; i <= year2; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    /**
     * Second level:
     * Implement the method that check if the given number is prime
     */

    private static boolean isPrimeNumber(int number) {
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                System.out.println("Given number is not prime");
                break;
            }
        }
        if (!flag) {
            System.out.println("Given number is prime");
        }
        return flag;
    }
}
