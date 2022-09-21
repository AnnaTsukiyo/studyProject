package com.example.studyproject.algorithms.hometask5;

/**
 * First level:
 * A singly linked list is given (pointer to head).
 * Given a natural number k.
 * Remove the kth element from the end of this list.
 * Hint: Use the two pointer method to find the Kth element from the end.
 */
public class Hometask5 {

    public static void main(String[] args) {
        List list = new List();
        for (int i = 1; i < 12; i++) {
            list.add(i);
        }
        System.out.println();
        list.printList();
        System.out.println();
        list.removeFromEnd(5);
        list.printList();
    }
}
