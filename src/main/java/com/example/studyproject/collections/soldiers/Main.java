package com.example.studyproject.collections.soldiers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Soldier anthony = new Soldier("Anthony", 170);
        Soldier ian = new Soldier("Ian", 185);
        Soldier jane = new Soldier("Jane", 177);
        Soldier mark = new Soldier("Mark", 195);
        List<Soldier> soldiersList = new ArrayList<>(Arrays.asList(anthony, ian, jane, mark));
        Collections.sort(soldiersList);
        System.out.println(soldiersList);
    }
}
