package com.example.studyproject.oop.hometask14;

import java.util.ArrayList;

public class PizzaOrder {

    ArrayList<Pizza> pizzas = new ArrayList<>();
    private int countPizzas = 0;

    PizzaOrder() {
    }

    public int getCountPizzas() {
        return countPizzas;
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
        countPizzas++;
    }

    public int calcTotalPrice() {
        int price = 0;
        for (int i = 0; i < countPizzas; i++) {
            price += pizzas.get(i).calcPrice();
        }
        return price;
    }
}

