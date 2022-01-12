package com.itrex.chapter2.factory.mebel;

public class Chair implements Furniture{

    @Override
    public Furniture getFurniture() {
        System.out.println("this is chair");
        return new Chair();
    }

}
