package com.example.studyproject.lambda;

import static java.lang.System.*;

/**
 * 1. Write a lambda expression for the Printable interface that contains one void print() method.
 * 2. Write a functional interface with a method that takes a number and returns a boolean value.
 * Write an implementation of this interface as a lambda expression that returns true if the number you pass in
 * the number is divisible by 13 without a remainder.
 */

public class Main {
    public static void main(String[] args) {
        Printable<String> printable = p -> {
            out.println(p);
        };

        int k = 13;
        DividedBy13<Boolean, Integer> divided = n -> n % k == 0;

        Integer first = 130;
        Integer second = 145;
        printable.print(String.format("Number %d is%s divisible by %d without a remainder.", first, divided.dividedWithoutRemainder(first) ? "" : " not", k));
        printable.print(String.format("Number %d is%s divisible by %d without a remainder.", second, divided.dividedWithoutRemainder(second) ? "" : " not", k));

    }
}