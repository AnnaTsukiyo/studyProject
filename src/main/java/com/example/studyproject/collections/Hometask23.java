package com.example.studyproject.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * First level:
 * Given two LinkedList containing integers.
 * The numbers are in ascending order. You need to get the third LinkedList,
 * which is the union of the first two, and the numbers in it must also be in ascending order.
 * For example:
 * from the lists 1 - 2 - 4 and 1 - 3 - 4, you should get 1 - 1 - 2 - 3 - 4 - 4.
 * <p>
 * Second level:
 * Given an ArrayList containing integers and the number k.
 * It is necessary to cyclically shift the numbers in the ArrayList to the right by k positions.
 * For example:
 * 1 - 2 - 3 - 4 - 5 - 6 with k = 1 becomes 6 - 1 - 2 - 3 - 4 - 5, and with k = 3 it becomes 4 - 5 - 6 - 1 - 2 - 3.
 * <p>
 */

public class Hometask23 {

    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>();//Level1
        for (int i = 1; i < 5; i++) {
            list1.add(i);
        }

        List<Integer> list2 = new LinkedList<>();
        for (int i = 3; i < 11; i++) {
            list2.add(i);
        }
        List<Integer> list3 = new LinkedList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        Collections.sort(list3);
        System.out.println(list3);

        ArrayList<Integer> integersList = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            integersList.add(i);
        }
        System.out.println("List before shifting:");
        printArray(integersList);
        System.out.println("List after shifting:");
        printArray(arrayShifting(integersList, 2));//Level2
    }

    private static ArrayList<Integer> arrayShifting(ArrayList<Integer> list, int k) {

        if (k < 0) throw new IllegalArgumentException("Error! Position can't be negative!");

        ArrayList<Integer> list2 = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((i + k) < list.size()) {
                index = i + k;
            } else {
                index = i + k - list.size();
            }
            list2.add(list.get(index));
        }
        return list2;
    }

    private static void printArray(ArrayList<Integer> array) {
        for (Integer integer : array) {
            System.out.println(integer);
        }
    }
}

