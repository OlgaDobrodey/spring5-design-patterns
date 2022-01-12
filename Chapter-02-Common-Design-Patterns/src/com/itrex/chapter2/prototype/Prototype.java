package com.itrex.chapter2.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Prototype {

    private String type;
    private Integer number;

    public abstract Prototype clone();

}
