package com.example.studyproject.collections;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given two ArrayList representing two non-negative integers. The digits that make up these numbers are stored individually in an ArrayList. For example,
 * ArrayList a = new ArrayList<>();
 * a.add(2);
 * a.add(4);
 * a.add(3);
 * represents the three-digit number 243.
 * Write a program that adds two numbers given in this way and gets the answer as a new ArrayList.
 */

public class Hometask19 {

    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        first.add(2);
        first.add(3);
        first.add(4);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(5);
        second.add(6);
        second.add(7);
        System.out.println(sumOfArrays(first, second));
        System.out.println(getArrayList(getNumber1(first) + getNumber2(second)));
        System.out.println(getArrayList2(890));
    }

    private static int getNumber1(ArrayList<Integer> first) {
        StringBuilder string = new StringBuilder();
        for (Integer integer : first) string.append(integer);
        return Integer.parseInt(string.toString());
    }

    private static int getNumber2(ArrayList<Integer> second) {
        return IntStream.iterate(second.size() - 1, i -> i >= 0, i -> i - 1).map(i -> second.get(i) * (int) Math.pow(10, second.size() - i - 1)).sum();
    }

    private static ArrayList<Integer> sumOfArrays(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> numbersSumResult = new ArrayList<>();
        int remainder = 0;
        int i = first.size() - 1;
        int j = second.size() - 1;
        while (i >= 0 || j >= 0) {
            int value1 = 0;
            if (i >= 0) {
                value1 = first.get(i);
                i--;
            }
            int value2 = 0;
            if (j >= 0) {
                value2 = second.get(j);
                j--;
                numbersSumResult.add(0, (value1 + value2 + remainder) % 10);
            } else {
                numbersSumResult.add(0, (value1 + value2 + remainder) % 10);
            }
            remainder = (value1 + value2 + remainder) / 10;
        }
        if (remainder > 0) numbersSumResult.add(0, remainder);
        return numbersSumResult;
    }

    private static ArrayList<Integer> getArrayList(int number) {
        ArrayList<Integer> result;
        String string = String.valueOf(number);
        result = IntStream.range(0, string.length()).mapToObj(i -> Integer.parseInt(String.format("%s", string.charAt(i)))).collect(Collectors.toCollection(ArrayList::new));
        return result;
    }

    private static ArrayList<Integer> getArrayList2(int number) {
        ArrayList<Integer> result = new ArrayList<>();
        while (number > 0) {
            result.add(0, number % 10);
            number = number / 10;
        }
        return result;
    }
}
