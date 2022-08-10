package com.example.studyproject.oop.hometask16;

public class Cat extends Animal {
    private static final int MAX_DISTANCE_RUN = 200;

    public Cat(String name) {
        super("Cat " + name);
        this.runLimit = MAX_DISTANCE_RUN;
        this.swimLimit = 0;
    }
}
