package com.example.studyproject.algorithms.closing_brackets;

import java.util.stream.IntStream;

/**
 * First level:
 * Write a program that checks whether parentheses like (, ), {, }, [, ] are closed in a character string
 * (if the string consists of only these types of brackets). So the string (([]{})) is correct,
 * but the strings (({}[)) and (([{]})) are incorrect: the first of them is missing one parenthesis,
 * and the second has a broken logic (closing the parenthesis must be the same type as the last opening parenthesis).
 */

public class Main {

    public static void main(String[] args) {

        Stack st1 = new Stack();
        char[] brackets = {'(', ')', '[', ']', '{', '}'};
        String str = "(([{]}))";
        for (int i = 0; i < str.length(); i++) {
            if (isOpeningBracket(str.charAt(i), brackets)) {
                st1.push(str.charAt(i));
            } else {
                if (st1.isEmpty()) {
                    System.out.println("A wrong bracket string!");
                    return;
                }
                if (!areBracketsMatch(st1.pop(), str.charAt(i), brackets)) {
                    System.out.println("Brackets doesn't match!");
                    return;
                }
            }
        }
        if (st1.isEmpty()) {
            System.out.println("A correct bracket string!");
        } else {
            System.out.println("A wrong bracket string!");
        }
    }

    private static boolean isOpeningBracket(char c, char[] brackets) {
        return IntStream.iterate(0, i -> i < brackets.length, i -> i + 2).anyMatch(i -> brackets[i] == c);
    }

    private static boolean areBracketsMatch(char opening, char closing, char[] brackets) {
        return IntStream.iterate(0, i -> i < brackets.length, i -> i + 2).anyMatch(i -> brackets[i] == opening && brackets[i + 1] == closing);
    }
}