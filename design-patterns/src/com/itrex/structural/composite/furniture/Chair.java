package com.itrex.structural.composite.furniture;

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
