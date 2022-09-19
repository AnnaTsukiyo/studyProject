package com.example.studyproject.collections.soldiers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Soldiers have always been built, are being built and will be built in descending order of growth.
 * Sort the soldiers, having previously thought about what is better to use under such conditions -Comparable or Comparator.
 * Implement the Soldier class. It is possible with one field - growth.
 * Create a collection of soldiers and sort it. Whether you use Comparable or Comparator is up to you,
 * but you need to explain your choice.
 */
@Getter
@AllArgsConstructor
@ToString
public class Soldier implements Comparable<Soldier> {

    // Comparable is used for the following reasons:
    // 1.Comparable provides a single sorting sequence.
    // In other words, we can sort the collection on the basis of a single element such as id, name, and price.
    // This method can sort the data according to the natural sorting order.
    // 2. The logic of sorting must be in the same class whose object you are going to sort.

    private String name;
    private int height;

    @Override
    public int compareTo(Soldier o) {
        return o.height - this.height;
    }
}


