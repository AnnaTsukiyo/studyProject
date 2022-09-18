package com.example.studyproject.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 1.What the code snippet will output:
 * import java.util.HashSet;
 * class Person {
 * String name;
 * Person(String name) { this.name = name; }
 * public String toString() { return name; }
 * }
 * class TestHashSet {
 * public static void main(String args[]) {
 * HashSet set = new HashSet<>();
 * Person p1 = new Person("Иван");
 * Person p2 = new Person("Мария");
 * Person p3 = new Person("Пётр");
 * Person p4 = new Person("Мария");
 * set add(p1);
 * set add(p2);
 * set add(p3);
 * set add(p4);
 * System.out.print(set.size());
 * }
 * }
 * Second level:
 * <p>
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays, and you may return the result in any order.
 * Example 1:
 * Input:
 * Output: [2,2]
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 */
public class Hometask21 {
    //Level 1 : input will be: 4
    //Level 2
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] ans = intersect(nums1, nums2);
        for (int x : ans)
            System.out.printf("%d ", x);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
            return new int[0];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1)
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);

        List<Integer> result = new ArrayList<>();

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                int freq = map.get(num);
                freq--;
                map.put(num, freq);
            }
        }

        return listToArray(result);
    }

    private static int[] listToArray(List<Integer> list) {

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
