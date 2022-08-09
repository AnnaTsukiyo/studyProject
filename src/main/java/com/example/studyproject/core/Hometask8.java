package com.example.studyproject.core;

/**
 * First level: 3 tasks;
 * Second level: 1 task ;
 */

public class Hometask8 {

    public static void main(String[] args) {
        charReplacement("I always do my homework", 'a', 'A'); // Level 1 Task 1
        findBiggest(new int[]{10, 33, 3, 5, -9});// Level 1 Task 2
        findSumOfElements(new int[]{10, 3, 23, 5, -9});// Level 1 Task 3
        if (isPalindrome("Anna".toLowerCase())) { //Level 2 Task 1
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    /**
     * First level Task1:
     * Loops
     * 1.Write a method that takes a String and two chars.
     * As the result it returns the given String, where each the first char was replaced by the second char.
     * You have to use only length() and charAt() methods of String class.
     * For example:  “I always do my homework”, ‘a’, ‘A’ -> “I AlwAys do my homework”
     */

    private static String charReplacement(String phrase, char a, char b) {
        if (null == phrase || phrase.isEmpty()) {
            return phrase;
        }
        StringBuilder replaced = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            replaced.append(c == a ? b : c);
        }
        System.out.println(replaced);
        return replaced.toString();
    }

    /**
     * First level Task 2:
     * Arrays
     * 2.Implement a method that returns the index of the biggest element of a given array of int{10, 33, 3, 5, -9} -> 1
     */

    private static int findBiggest(int[] numbers) {
        int maxAt = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxAt]) {
                maxAt = i;
            }
        }
        System.out.printf("The index of the biggest element of the given array is %d%n", maxAt);

        return maxAt;
    }

    /**
     * First level Task 3:
     * Arrays
     * Implement a method that returns the sum of elements of the given array of int{10, 3, 23, 5, -9} -> 32
     */

    private static int findSumOfElements(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.printf("The sum of elements of the given array is %d%n", sum);
        return sum;
    }

    /**
     * Second level Task 1:
     * Write method that checks whether a given string is a palindrome.
     * A palindrome is a phrase that reads the same from the front and the back.
     */

    private static boolean isPalindrome(String phrase) {
        StringBuilder revert = new StringBuilder();
        boolean checkResult = false;

        for (int i = phrase.length() - 1; i >= 0; i--) {
            revert.append(phrase.charAt(i));
        }
        if (phrase.equals(revert.toString())) {
            checkResult = true;
        }
        return checkResult;
    }
}
