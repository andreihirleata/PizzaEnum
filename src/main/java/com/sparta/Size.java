package com.sparta;

// static
public enum Size {
    SMALL("Small Pizza",100),
    MEDIUM("Medium Pizza",180),
    LARGE("Large Pizza",230),
    EXTRALARGE("Extra Large Pizza",400);


    private final String pizzaSize;
    private final int pizzaCalories;

    private Size(String pizzaSz, int pizzaCals) {
        this.pizzaSize = pizzaSz;
        this.pizzaCalories = pizzaCals;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public int getPizzaCalories() {
        return pizzaCalories;
    }

    public int getJoules() {
        return (int)(this.pizzaCalories * 4.184);
    }
}
