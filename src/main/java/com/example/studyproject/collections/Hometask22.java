package com.example.studyproject.collections;

import java.util.*;

/**
 * Given a line. Print the number of occurrences of each character in this string. For example:
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque. Nulla.
 * The character e occurs 20 times.
 * The space character occurs 19 times.
 * The character l occurs 11 times.
 * The character i occurs 11 times.
 * The symbol t occurs 11 times.
 * The character s occurs 10 times.
 * The character u occurs 7 times.
 * The character a occurs 7 times.
 * The character n occurs 6 times.
 * The symbol m occurs 6 times.
 * The symbol o occurs 6 times.
 * The character r occurs 5 times.
 * Symbol . occurs 4 times.
 * The symbol g occurs 4 times.
 * The symbol d occurs 4 times.
 * The character c occurs 3 times.
 * The symbol p occurs 3 times.
 * Symbol , occurs 1 time.
 * The character f occurs 1 time.
 * The character b occurs 1 time.
 * The character q occurs 1 time.
 * <p>
 * Second level: Display statistics by letter (task from Level 1) in descending order.
 */

public class Hometask22 {

    public static void main(String[] args) {

        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque. Nulla.";

        var strings = string.toLowerCase().split("");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            String el = String.valueOf(s);
            if (el.equals(" ")) el = "\"space\"";
            map.put(el, map.containsKey(el) ? map.get(el) + 1 : 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());

        System.out.println("Sort by character in descending order \n");
        for (Map.Entry<String, Integer> s : list) {
            System.out.println("The character " + s.getKey() + " occurs " + s.getValue() + " time(s).");
        }

        System.out.println("-".repeat(20));

        List<Map.Entry<String, Integer>> list2 = new ArrayList<>(map.entrySet());
        list2.sort((o1, o2) -> {
            if (Objects.equals(o1.getKey(), o2.getKey())) {
                return 0;
            }
            if (o1.getKey() == null) {
                return -1;
            }
            if (o2.getKey() == null) return 1;
            return o2.getKey().compareTo(o1.getKey());
        });

        System.out.println("Sort in descending order by characters \n");
        for (Map.Entry<String, Integer> s : list2) {
            System.out.printf("The character %s occurs %d time(s).\n", s.getKey(), s.getValue());
        }
    }
}
