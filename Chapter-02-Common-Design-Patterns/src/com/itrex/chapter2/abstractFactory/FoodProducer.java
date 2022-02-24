package com.itrex.chapter2.abstractFactory;

public class FoodProducer {

    public static AbstractFood getFood() {
        int number = (int) (Math.random() * 10);
        System.out.println("If number >= 5 - getting food, else - getting drink");

        if (number >= 5) {
            System.out.println(number + " Food");
            return new Food();
        } else {
            System.out.println(number + " Drink");
            return new Drink();
        }
    }

}
