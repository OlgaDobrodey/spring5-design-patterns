package com.itrex.chapter3.decorate;

public class MainDecorate {

    public static void main(String[] args) {
        Product cream = new Cream();
        cream.getTitle();
        System.out.println("price = "+cream.getPrice());


        Product natureCream = new NatureDecorate(new Cream());
        natureCream.getTitle();
        natureCream.getPrice();

    }

}
