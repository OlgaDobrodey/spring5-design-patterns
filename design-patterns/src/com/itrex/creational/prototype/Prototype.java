package com.itrex.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Prototype {

    private String type;
    private Integer number;

    public abstract Prototype clone();

}
