package com.example.studyproject.core;

import java.util.Arrays;

/**
 * First level: 2 tasks;
 * Second level: 1 task;
 */

public class Hometask10 {
    public static void main(String[] args) {
        newArrayRandomNumbers(3, 4); //Level 1 Task1
        checkAverageRowElements(new int[][]{{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}}, 1); //Level 1 Task2
        int[][] result = fillDiagonals(7);   //Level 2 Task1
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }

        /*
          First level Task1:
          In this assignment you should write the program that create a new array int[n][m],
          fill it with random integers and displays it
         */
    }

    private static int[][] newArrayRandomNumbers(int rows, int columns) {
        int[][] array = new int[rows][columns];
        System.out.println("A filled in array : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 100));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    /*
      First level Task2:
      Implement the method that takes int[][] array and row number
      and checks that the average of the elements in a row is greater than 0
     */

    private static boolean checkAverageRowElements(int[][] array, int rowNumber) {
        int average = 0;
        boolean isGreaterZero = false;
        for (int row = 0; row < array.length; row++) {
            int rowTotal = 0;
            for (int column = 0; column < array[row].length; column++) {
                rowTotal += array[row][column];
            }
            if (rowNumber == row) {
                average = rowTotal / array[row].length;
                if (average > 0) {
                    System.out.println("The average of the elements in a row is greater than 0!");
                    isGreaterZero = true;
                } else {
                    System.out.println("The average of the elements in a row is not greater than 0!");
                }
            }
            rowTotal = 0; // start over
        }
        return isGreaterZero;
    }

    /*
       Level 2 Task1
       Given a square array (the number of rows is the same as the number of columns) filled with zeros.
       Fill both diagonals of the array with ones.
     */

    private static int[][] fillDiagonals(int n) {
        int[][] filledArray = new int[n][n];
        for (int i = 0; i <= n / 2; i++) {
            filledArray[i][i] = filledArray[i][n - i - 1] = filledArray[n - i - 1][i] = filledArray[n - i - 1][n - i - 1] = 1;
        }
        return filledArray;
    }
}
