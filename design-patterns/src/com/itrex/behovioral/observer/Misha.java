package com.itrex.behovioral.observer;

public class Misha implements Observer{

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName()+ " get notify");
    }

}
