package com.example.studyproject.oop.hometask14;

public class Pizza {

    private String size;
    private int cheese, pepperoni, ham;
    public static final String SIZE_SMALL = "small", SIZE_MEDIUM = "medium", SIZE_LARGE = "large";

    public Pizza(String size, int cheese, int pepperoni, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }

    public Pizza() {
        cheese = 0;
        pepperoni = 0;
        ham = 0;
        size = "medium";
    }

    public int calcPrice() {
        int calculatedPrice, sizePrice = 0;
        int toppingPrice = 2 * cheese + 2 * pepperoni + 2 * ham;
        switch (size) {
            case SIZE_SMALL -> sizePrice = 10;
            case SIZE_MEDIUM -> sizePrice = 12;
            case SIZE_LARGE -> sizePrice = 14;
        }
        calculatedPrice = sizePrice + toppingPrice;
        return calculatedPrice;
    }

    public String getSize() {
        return switch (size) {
            case SIZE_SMALL -> "small";
            case SIZE_MEDIUM -> "medium";
            case SIZE_LARGE -> "large";
            default -> null;
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    public int getHam() {
        return ham;
    }

    public void setHam(int ham) {
        this.ham = ham;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", ham=" + ham +
                '}';
    }
}
