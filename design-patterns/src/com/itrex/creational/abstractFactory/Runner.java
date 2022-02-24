package com.itrex.creational.abstractFactory;

public class Runner {

    public static void main(String[] args) {
        AbstractFood food = FoodProducer.getFood();
        food.getHealthyFood().getHealthy();
        food.getTastyFood().getTasty();
    }

}
