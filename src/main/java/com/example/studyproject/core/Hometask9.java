package com.example.studyproject.core;

/**
 * First level: 4 tasks;
 * Second level: 1 task;
 */

public class Hometask9 {

    public static void main(String[] args) {

        newArrayPowerOf2(5); //Level 1 Task1
        newArrayInReverse(new int[]{10, 3, 3, 5, -9}); //Level 1 Task2
        givenArrayInReverse(new int[]{10, 3, 3, 5, -9});  //Level 1 Task3
        mergeSortedArrays(new int[]{1, 4, 6, 8}, new int[]{3, 7});  //Level 1 Task4
        selectionSort(new int[]{12, -4, 10, 20, 40, 0, 100});  //Level 2 Task1
    }

    /**
     * First level Task1:
     * Implement a method that returns new array of int.
     * Every element of the array is next power of two.
     * The length of the array is given n (the max value of n is 30.
     * Why do you think?)powerOfTwo (5) -> {1,2,4,8,16}
     */

    private static int[] newArrayPowerOf2(int length) {
        int[] array = new int[length];
        for (int i = 1; i < Math.pow(2, length); i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        return array;
    }

    /**
     * First level Task2:
     * Implement a method that returns the new array that is the given array in reverse order{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
     */

    private static int[] newArrayInReverse(int[] givenArray) {
        int[] reversed = new int[givenArray.length];
        int j = givenArray.length;
        for (int value : givenArray) {
            reversed[j - 1] = value;
            j = j - 1;
        }
        System.out.println("Reversed array is: ");
        for (int k = 0; k < givenArray.length; k++) {
            System.out.print(reversed[k] + " ");
        }
        System.out.println();
        return reversed;
    }

    /**
     * First level Task3:
     * Implement a method that makes a given array in reverse order.
     * It’s look like previous, but you should solve it without new array{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
     */

    private static void givenArrayInReverse(int[] givenArray) {

        for (int i = 0; i < givenArray.length / 2; i++) {
            int t = givenArray[i];
            givenArray[i] = givenArray[givenArray.length - i - 1];
            givenArray[givenArray.length - i - 1] = t;
        }

        System.out.println("Reversed array is: ");
        for (int i : givenArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * First level Task4:
     * Assume that there are two arrays of numbers, each sorted in ascending order.
     * Implement the method int[] merge(int[], int[]) that merge these arrays into a single sorted array.
     * ({1,4,6,8},{3,7}) ->{1,3,4,6,7,8}({12,19},{3,7}) ->{3,7,12,19}
     */
    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
        System.out.println("Array after merging the given ones: ");
        for (i = 0; i < arr1.length + arr2.length; i++) {
            System.out.print(merged[i] + " ");
        }
        System.out.println();
        return merged;
    }

    /**
     * Second level Task1:
     * Try to independently come up with and implement an algorithm for sorting a one-dimensional array.
     * It is allowed to study known methods and implement one of them.
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minimum = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minimum = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minimum] = temp;
        }
        System.out.println("Implementation of selection sorting");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}


