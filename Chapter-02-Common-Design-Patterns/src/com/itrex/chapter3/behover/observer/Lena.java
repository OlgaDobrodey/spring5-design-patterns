package com.itrex.chapter3.behover.observer;

public class Lena implements Observer{

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName()+ " get notify");
    }

}
