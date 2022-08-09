package com.example.studyproject.oop.hometask14;

/**
 * First level:
 * 1.Set up the Author class with firstName and lastName fields,
 * add a constructor, getters, setters and toString.
 * 2.Design class Book with fields title, author: author and price.
 * Write a constructor, getters, setters and toString
 * 3.Configure Pizza class, String type size fields (with possible values "small", "medium" and "large"),
 * cheese:int, pepperoni:int, ham:int=0.
 * Add Pizza view constructor(String size, cheese, ham, pepperoni),
 * getters, setters and toString.
 * Add the calcPrice() method: int - small 10, medium 12, large 14 and each topping 2.
 * Set up a PizzaOrder class where you can add pizza using the add(Pizza) method
 * and write a calcTotalPrice(): int method that calculates the total order amount for all pizzas.
 */

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
