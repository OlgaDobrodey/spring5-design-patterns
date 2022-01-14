package com.itrex.chapter3.decorate;

public class Shampoo implements Product{

    private Integer price = 50;

    @Override
    public Integer getPrice() {
        System.out.println("price= "+ price);
        return price;
    }

    @Override
    public void getTitle() {
        System.out.println(this.getClass().getSimpleName()+" ");
    }

}
