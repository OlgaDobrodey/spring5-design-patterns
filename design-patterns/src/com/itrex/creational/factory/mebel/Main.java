package com.itrex.creational.factory.mebel;

public class Main {

    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();
        int i = (int) (Math.random() * 10);
        Furniture instance = factory.getInstance(i).getFurniture();
    }

}
