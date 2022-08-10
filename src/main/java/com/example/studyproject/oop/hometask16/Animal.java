package com.example.studyproject.oop.hometask16;

/**
 * Hometask 16
 * First level: 1. Create classes "Dog" and "Cat" with inheritance from the class "Animal".
 * All animals can run and swim. The length of the obstacle is passed as a parameter to each method.
 * The result of the action will be printing to the console.
 * For example dogBobik.run(150); -> 'Bobik ran 150 m'.
 * Each animal has restrictions on actions:
 * running: cat - 200 m, dog - 500 m;
 * swimming: the cat cannot swim, the dog - 10 m.
 */

public class Animal {

    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int distance) {
        if (distance >= 0 && distance <= runLimit) {
            System.out.printf("%s ran %d m%n", this.name, distance);
        } else {
            System.out.printf("Error! %s can't run a given distance. The length of the obstacle is out of limit.%n", this.name, distance);
        }
    }

    public void swim(int distance) {
        if (distance >= 0 && distance <= swimLimit) {
            System.out.printf("%s swam %d m%n", this.name, distance);
        } else {
            System.out.printf("Error! %s can't swim given distance. The length of the obstacle is out of limit.%n", this.name, distance);
        }
    }
}
