package com.example.studyproject.other_hw;

import java.util.Scanner;

/**
 * 1 level of complexity:
 * 1. Write a regular expression that determines whether this line is a sixteen -the richest color identifier in HTML. Where #FFFFFFF for white, #000000 for black, #FF0000 for red, etc.
 * - An example of the correct expressions: #FFFFFF, #FF3421, #00F00.
 * - An example of incorrect expressions: 232323, F #fddee, #fd2.
 * <p>
 * 2.Check if the password is reliable. The password is considered reliable if it consists of 8 or more characters. Where there can be a symbol of the English letter, figure and sign of emphasis.
 * - An example of the correct expressions: C00L_PASS, SUPPERPAS1.
 * - An example of incorrect expressions: C00L.
 */

public class RegExp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the color id");// Level 1 Task 1
        String enteredColor = scanner.next();

        System.out.println(enteredColor.matches("^#[a-fA-F0-9]{6}$"));

        System.out.println("Please enter the password"); //Level 1 Task2
        String enteredPass = scanner.next();


        System.out.println(enteredPass.matches("^[a-zA-Z0-9_]{8,256}$"));

    }
}
