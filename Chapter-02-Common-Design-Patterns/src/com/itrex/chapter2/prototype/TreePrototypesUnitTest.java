package com.itrex.chapter2.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreePrototypesUnitTest {

    @Test
    public void givenAPlasticTreePrototypeWhenClonedThenCreateA_Clone() {
        // the first prototype class
        Prototype prototypeType1 = new PrototypeType1().clone();
        String type1 = "Type1";
        Integer number1 = 1;

        // the second prototype class
        Prototype prototypeType2 = new PrototypeType2().clone();
        String type2 = "Type2";
        Integer number2 = 2;

        assertEquals(type1, prototypeType1.getType());
        assertEquals(number1, prototypeType1.getNumber());
        assertEquals(type2, prototypeType2.getType());
        assertEquals(number2, prototypeType2.getNumber());
    }

}
