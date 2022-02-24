package com.itrex.chapter3.composite.furniture;

public class Chair extends Furniture {

    private Integer costChair;

    public Chair(){
        this.costChair = 60;
    }

    @Override
    public Integer getCost() {
        return costChair;
    }

}
