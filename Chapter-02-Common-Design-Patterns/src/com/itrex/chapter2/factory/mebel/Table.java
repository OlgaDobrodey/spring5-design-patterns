package com.itrex.chapter2.factory.mebel;

public class Table implements Furniture {

    @Override
    public Furniture getFurniture() {
        System.out.println("this is table");
        return new Table();
    }

}
