package com.itrex.creational.factory.mebel;

public class FurnitureFactory {

    public Furniture getInstance(int number) {
        System.out.println(number);
        if (number > 5) {
            return new Chair();
        } else return new Table();
    }

}
