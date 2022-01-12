package com.itrex.chapter2.prototype;

public class PrototypeType2 extends Prototype {

    @Override
    public Prototype clone() {
        Prototype prototype = new PrototypeType2();
        prototype.setType("Type2");
        prototype.setNumber(2);
        return prototype;
    }

}
