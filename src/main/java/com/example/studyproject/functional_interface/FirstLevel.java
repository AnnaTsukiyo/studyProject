package com.example.studyproject.functional_interface;

/**
 * First Level
 * Write a functional interface with a method that takes two strings and returns the same string.
 * Write an implementation of such an interface in the form of a lambda that returns the string that is longer.
 */
public class FirstLevel {

    public static void main(String[] args) {

        StringTask obj = ((Str1, Str2) -> {
            if (Str1.length() <= Str2.length()) return Str2;
            else {
                return Str1;
            }
        });
        String result = obj.compareStrings("LongLoooongString", "VeryVeryLongLoooongString");
        System.out.println(result);


    }
}
