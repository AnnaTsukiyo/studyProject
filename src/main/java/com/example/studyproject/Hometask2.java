package com.example.studyproject;

import java.util.Scanner;

/**
 * Hometask2
 * First level: 1: 5 tasks;
 * Second level: no tasks ;
 */

public class Hometask2 {
    public static void main(String[] args) {
        userNamePrinting(); //Task1
        firstCharPrinting(); //Task2
        findCubeVolumeAndArea(); //Task3
        findArithmeticMean(); //Task4
        findTriangleHypotenuse(); // Task5
    }

    /**
     * Task1
     * Write a program that asks the user’s name and displays “Hello …… !” on the screen.
     */
    public static void userNamePrinting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your name");
        String userName = scanner.nextLine();
        System.out.printf("Hello %s !%n", userName);
    }

    /**
     * Task2
     * Write a program that asks the user’s name and displays “Your name start with char …” on the screen.
     */
    public static void firstCharPrinting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your name");
        String userName = scanner.nextLine();
        System.out.printf("Your name start with char %s !%n", userName.charAt(0));
    }

    /**
     * Task3
     * Given the length of an edge of a cube.
     * Find the volume of a cube and its lateral surface area.
     */
    public static void findCubeVolumeAndArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the length of an edge of a cube");
        int cubeEdge = scanner.nextInt();
        System.out.println("Lateral surface area of the cube with the cube edge " + cubeEdge + " is " + 4 * (int) (Math.pow(cubeEdge, 2)));
        System.out.println("Volume of the cube with the cube edge " + cubeEdge + " is " + (int) (Math.pow(cubeEdge, 3)));
    }

    /**
     * Task4
     * You are given two real numbers.
     * Find the arithmetic mean of these numbers.
     */
    public static void findArithmeticMean() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the first real number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Print the second real number");
        double secondNumber = scanner.nextDouble();
        System.out.println("The real mean of the given numbers is " + (firstNumber + secondNumber) / 2);
    }

    /**
     * Task5
     * Given the legs of a right triangle. Find its hypotenuse.
     */

    public static void findTriangleHypotenuse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the first leg of the triangle ");
        double a = scanner.nextDouble();
        System.out.println("Print the second leg of the triangle ");
        double b = scanner.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse of the triangle with the given legs is " + hypotenuse);
    }
}
