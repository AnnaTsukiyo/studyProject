package com.example.studyproject;

import java.util.Arrays;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the i-th digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 *
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 */

public class Hometask11 {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        int[]answer=plusOne(arr);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] plusOne(int[] digits) {
        int size = digits.length;
        int i = 0;

        for (i = size - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if (i == -1) {
            int[] newDigits = new int[size + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }
}