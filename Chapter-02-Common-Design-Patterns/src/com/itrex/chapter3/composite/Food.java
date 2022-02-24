package com.itrex.chapter3.composite;

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
