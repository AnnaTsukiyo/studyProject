package com.example.studyproject.algorithms.queue_deque;

/**
 * From 18/08/2022
 * Given a file of real numbers and two numbers a and b.
 * Using a queue (multiple queues), first print all elements less than a;
 * then all elements from the segment [a, b];
 * then all elements greater than b.
 */

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (100 * Math.random());
            System.out.println(numbers[i]);
        }
        System.out.println();
        int a = 15;
        int b = 45;

        Queue queue = new Queue();

        System.out.println("Numbers smaller than a: ");
        for (int v : numbers) {
            if (v < a) {
                System.out.println(v);
            } else {
                queue.add(v);
            }
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.delete());
        }
        System.out.println();
        System.out.println("Numbers from a to b:");

        for (int number : numbers) {
            if ((number > a) & (number < b)) {
                System.out.println(number);
            } else {
                queue.add(number);
            }
        }
        System.out.println();
        System.out.println("Numbers greater than b: ");
        for (int number : numbers) {
            if (number > b) {
                System.out.println(number);
            } else {
                queue.add(number);
            }
        }
    }
}