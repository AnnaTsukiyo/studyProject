package com.example.studyproject.functional_interface;

import java.util.HashSet;
import java.util.Set;

/**
 * Second Level
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class SecondLevel {

    public static void main(String[] args) {
        System.out.printf("abcabcbb has - %d maximum of consecutive unique chars%n", longestSubstringWithoutRepeatingCharacters("abcabcbb"));
        System.out.printf("bbbbb has - %d maximum of consecutive unique chars%n", longestSubstringWithoutRepeatingCharacters("bbbbb"));
        System.out.printf("pwwkew has - %d maximum of consecutive unique chars%n", longestSubstringWithoutRepeatingCharacters("pwwkew"));

        System.out.printf("abcabcbb has - %s as longest substring with unique chars%n", findLongestSubstringWithoutRepeatingCharacters("abcabcbb"));
        System.out.printf("bbbbb has - %s as longest substring with unique chars%n", findLongestSubstringWithoutRepeatingCharacters("bbbbb"));
        System.out.printf("pwwkew has - %s as longest substring with unique chars%n", findLongestSubstringWithoutRepeatingCharacters("pwwkew"));

    }

    public static int longestSubstringWithoutRepeatingCharacters(String str) {

        int n = str.length();
        int res = 0;

        for (int i = 0; i < n; i++) {

            boolean[] visited = new boolean[256];
            for (int j = i; j < n; j++) {
                if (visited[str.charAt(j)])
                    break;

                else {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
            visited[str.charAt(i)] = false;
        }
        return res;
    }

    public static String findLongestSubstringWithoutRepeatingCharacters(String str) {
        String substr = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            Set<Character> visited = new HashSet<>();
            int j = i;
            for (; j < len; j++) {
                char currChar = str.charAt(j);
                if (visited.contains(currChar)) {
                    break;
                } else {
                    visited.add(currChar);
                }
            }

            if (substr.length() < j - i + 1) {
                substr = str.substring(i, j);
            }
        }
        return substr;
    }
}