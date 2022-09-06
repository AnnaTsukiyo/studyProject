package com.example.studyproject.collections.calculator;

/**
 * Second level:
 * Write a Calculator class (non-generic) that contains generalized learned methods -
 * summation, multiplication, division, subtraction.
 * The parameters of these methods are two cases of different types, probably an operation was performed.
 */

public class Calculator {

    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, Q extends Number> double divide(T a, Q b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, Q extends Number> double subtraction(T a, Q b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {

        Integer a = 5;
        Double b = 5.5;
        System.out.println(sum(a, b));
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));
        System.out.println(subtraction(a, b));
    }
}
