package com.example.studyproject.collections;

import java.util.Iterator;

/**
 * First level: Write an array iterator.
 * Hint: There must be a class implemented (let's call it ArrayIterator, for example)
 * that implements the Iterator interface.
 */

public class ArrayIterator<T> implements Iterator<T> {
    private int index = 0;
    private final T[] array;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return array.length > index;
    }

    @Override
    public T next() {
        return array[index++];
    }

    public static void main(String[] args) {

        String[] array = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        ArrayIterator<String> arrayIterator = new ArrayIterator<>(array);
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}
