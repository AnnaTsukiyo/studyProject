package com.example.studyproject.algorithms.hometask5;

public class List {
    private Node head;
    private Node tail;

    public void add(int item) {

        Node temp = new Node();
        temp.value = item;
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
    }

    public void removeFromEnd(int k) {
        Node p = head;
        Node q = head;

        for (int i = 0; i < k; i++) {
            if (q.next != null) {
                q = q.next;
            } else if (i == k - 1) {
                head = head.next;
            } else {
                System.out.println("No such element");
                return;
            }
        }
        while (q.next != null) {
            q = q.next;
            p = p.next;
        }

        assert p.next != null;
        p.next = p.next.next;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    private static class Node {
        int value;
        Node next;
    }
}
