package com.example.studyproject.algorithms.linked_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.*;

/**
 * First level:
 * Given a singly linked list that stores integers.
 * Write a method that takes the number k as a parameter.
 * The method must find an element in the list with a value equal to k and remove it from the list.
 * We assume that such an element is necessarily in the list, and it occurs there once.
 * Example, 1 -> 2 -> 3 -> 4 -> 5 (original list). We call the remove(3) method.
 * 1 -> 2 -> 4 -> 5 (resulting list).
 * <p>
 * Second level: Given two singly linked lists that store integers in ascending order. Get the union of these two lists (the third list), in which the elements will also be sorted in ascending order.
 * Example, 1 -> 3 -> 5 -> 7 (first list), 0 -> 3 -> 4 (second list), 0 -> 1 -> 3 -> 3 -> 4 -> 5 -> 7 (resulting list).
 */
public class Hometask4 {

    public static void main(String[] args) {

        List<Integer> first = new LinkedList<>(asList(1, 2, 3, 4, 5));
        int k = 3;
        System.out.println(elementRemoval(first, k)); //Level1

        List<Integer> listOne = new LinkedList<>(asList(1, 3, 5, 7)); //Level2
        List<Integer> listSecond = new LinkedList<>(asList(0, 3, 4));
        System.out.println(shiftLists(listOne, listSecond));

    }

    private static List<Integer> elementRemoval(List<Integer> list, int k) {

        List<Integer> result = new LinkedList<>(list);
        Iterator<Integer> iterator = result.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(k)) {
                continue;
            }
            iterator.remove();
            break;
        }
        return result;
    }

    private static List<Integer> shiftLists(List<Integer> one, List<Integer> two) {

        List<Integer> result = new LinkedList<>();
        int i = 0, j = 0;
        while (i < one.size() && j < two.size()) {
            if (one.get(i) < two.get(j)) {
                result.add(one.get(i));
                i++;
            } else {
                result.add(two.get(j));
                j++;
            }
        }
        if (i < one.size()) {
            result.addAll(one.subList(i, one.size()));
        }
        if (j < two.size()) {
            result.addAll(two.subList(j, two.size()));
        }
        return result;
    }
}

