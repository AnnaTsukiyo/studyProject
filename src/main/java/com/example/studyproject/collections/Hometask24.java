package com.example.studyproject.collections;

import java.util.HashMap;

/**
 * First level: Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "leetcode"
 * Output: 0
 * <p>
 * Example 2:
 * <p>
 * Input: s = "loveleetcode"
 * Output: 2
 * <p>
 * Example 3:
 * <p>
 * Input: s = "aabb"
 * Output: -1
 */

public class Hometask24 {

    public static void main(String[] args) {
        System.out.println(firstUniqueCharacter("leetcode"));
        System.out.println(firstUniqueCharacter("loveleetcode"));
        System.out.println(firstUniqueCharacter("aabb"));
    }

    private static int firstUniqueCharacter(String string) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            if (!map.containsKey(current)) {
                map.put(current, i);
            } else {
                map.put(current, -1);
            }
        }

        int min = Integer.MAX_VALUE;
        for (char c : map.keySet()) {
            if (map.get(c) > -1 && map.get(c) < min) {
                min = map.get(c);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
