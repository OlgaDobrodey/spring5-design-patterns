package com.itrex.creational.prototype;

public class PrototypeType1 extends Prototype {

    @Override
    public Prototype clone() {
        Prototype prototype = new PrototypeType1();
        prototype.setType("Type1");
        prototype.setNumber(1);
        return prototype;
    }

}
