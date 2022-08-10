package com.example.studyproject.oop.hometask16;

public class Dog extends Animal {
    private static final int MAX_DISTANCE_RUN = 500;
    private static final int MAX_DISTANCE_SWIM = 10;

    public Dog(String name) {
        super("Dog " + name);
        this.runLimit = MAX_DISTANCE_RUN;
        this.swimLimit = MAX_DISTANCE_SWIM;
    }
}