package com.sparta;

public class Main {
    public static void main(String[] args) {
        Size size = Size.SMALL;
        System.out.println("Size: " + size.getPizzaSize());
        System.out.println("Cals: " + size.getPizzaCalories());
        System.out.println("Energy for this in Joules: " + size.getJoules());
        System.out.println("Joules Medium ?????" + Size.valueOf("MEDIUM").getJoules());
    }
}