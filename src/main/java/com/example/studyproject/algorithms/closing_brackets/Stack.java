package com.example.studyproject.algorithms.closing_brackets;

public class Stack {

    private StackItem top;

    public void push(char item) {
        StackItem temp = new StackItem();
        temp.value = item;
        temp.next = top;
        top = temp;
    }

    public char pop() {
        char a = top.value;
        top = top.next;
        return a;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    private static class StackItem {
        char value;
        StackItem next;
    }
}