package com.example.studyproject.collections.calculator;

/**
 * First level:
 * Make the Stack or Queue class generic.
 * Passed the work of the resulting classes.
 */

public class Hometask18 {
    public static void main(String[] args) {

        Stack<Integer> myNumberStack = new ArrayStack<>();
        Stack<String> myStringStack = new ArrayStack<>();
        myNumberStack.push(1);
        myStringStack.push("Test string!");
        System.out.println(myNumberStack);
        System.out.println(myStringStack);
    }
}
