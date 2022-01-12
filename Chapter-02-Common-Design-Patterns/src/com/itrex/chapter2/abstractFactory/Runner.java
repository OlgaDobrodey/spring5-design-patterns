package com.itrex.chapter2.abstractFactory;

public class Runner {

    public static void main(String[] args) {
        AbstractFood food = FoodProducer.getFood();
        food.getHealthyFood().getHealthy();
        food.getTastyFood().getTasty();
    }

}
