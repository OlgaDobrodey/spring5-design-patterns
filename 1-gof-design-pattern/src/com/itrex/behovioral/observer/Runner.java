package com.itrex.chapter3.behover.observer;

public class Runner {

    public static void main(String[] args) {

        Observer lena = new Lena();
        Observer misha = new Misha();

        Subject story = new Story();
        story.addObserver(lena);
        story.addObserver(misha);

        story.businessLogical();
    }

}
