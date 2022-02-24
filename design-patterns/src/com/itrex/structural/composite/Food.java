package com.itrex.structural.composite;

public class Food implements Product {

    private Integer costFood;
    public Food() {
        this.costFood = 80;
    }

    @Override
    public Integer getCost() {
        return costFood;
    }

}
