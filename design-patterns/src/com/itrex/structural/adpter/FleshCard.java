package com.itrex.structural.adpter;

public class FleshCard implements Card {

    @Override
    public void getCard() {
        System.out.println("Flesh Card get");
    }

    @Override
    public void putCard() {
        System.out.println("Flesh Card put");
    }

}
