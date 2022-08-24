package com.example.studyproject.algorithms.baseball_game;

public class Stack {

    private StackItem top;

    public void push(int item) {
        StackItem temp = new StackItem();
        temp.value = item;
        temp.next = top;
        top = temp;
    }

    public int pop() {
        int a = top.value;
        top = top.next;
        return a;
    }

    public int top() {
        return top.value;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    private static class StackItem {
        int value;
        StackItem next;
    }
}