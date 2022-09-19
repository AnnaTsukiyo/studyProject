package com.example.studyproject.collections;

import java.util.*;

/**
 * First level: 1. The task is to remove duplicate elements in the ArrayList.
 * Examples:
 * Input: ArrayList = [1, 2, 2, 3, 4, 4, 4]
 * Output: [1, 2, 3, 4]
 * Input: ArrayList = [12, 23, 23, 34, 45, 45, 45, 45, 57, 67, 89]
 * Output: [12, 23, 34, 45, 57, 67, 89]
 * <p>
 * Given an ArrayList containing integers and the number k.
 * It is necessary to cyclically shift the numbers in the ArrayList to the right by k positions.
 * For example, 1 - 2 - 3 - 4 - 5 - 6 with k = 1 becomes 6 - 1 - 2 - 3 - 4 - 5,
 * and with k = 3 it becomes 4 - 5 - 6 - 1 - 2 - 3.
 */

public class Hometask20 {

    public static void main(String[] args) {

        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);

        System.out.println("List with duplicates:");
        printArray(list);
        System.out.println("List without duplicates:");
        printArray(removingDuplicatesFromList(list));  //Level1 Task1

        ArrayList<Integer> integersList = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            integersList.add(i);
        }
        System.out.println("List before shifting:");
        printArray(integersList);
        System.out.println("List after shifting:");
        printArray(arrayShifting(integersList, 2));//Level1 Task2
    }

    private static ArrayList<Integer> removingDuplicatesFromList(List<Integer> list) {
        var newList = new ArrayList<Integer>();
        newList.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            int number = list.get(i);
            if (isNotInList(newList, number)) {
                newList.add(number);
            }
        }
        return newList;
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

    private static boolean isNotInList(List<Integer> newList, int number) {
        boolean result = true;
        for (Integer integer : newList) {
            if (number == integer) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static void printArray(ArrayList<Integer> array) {
        for (Integer integer : array) {
            System.out.println(integer);
        }
    }
}