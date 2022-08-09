package com.example.studyproject.oop.hometask14;

public class Main {
    public static void main(String[] args) {

        PizzaOrder pizzaOrder1 = new PizzaOrder();
        Pizza smallPizza = new Pizza("small", 2, 2, 2);
        pizzaOrder1.addPizza(smallPizza);
        Pizza mediumPizza = new Pizza("medium", 0, 0, 1);
        pizzaOrder1.addPizza(mediumPizza);
        System.out.printf("%d pizza(s) order cost is %d%n", pizzaOrder1.getCountPizzas(), pizzaOrder1.calcTotalPrice());
    }
}
