package com.itrex.structural.decorate;

public class Cream implements Product{

    private Integer price;

    public Cream() {
        this.price = 50;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public void getTitle() {
        System.out.println(this.getClass().getSimpleName()+" ");
    }

}
