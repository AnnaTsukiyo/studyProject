package com.example.studyproject.algorithms.queue_deque;

public class Queue {
    private QueueItem head;
    private QueueItem tail;

    public void add(int item) {
        QueueItem temp = new QueueItem();
        temp.value = item;
        if (isEmpty()) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
    }

    public int delete() {
        int a = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return a;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private static class QueueItem {
        public int value;
        public QueueItem next;
    }
}
