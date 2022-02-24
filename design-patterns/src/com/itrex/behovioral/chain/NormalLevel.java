package com.itrex.behovioral.chain;

import com.itrex.model.Person;

public class NormalLevel extends LevelHandler {

    private static final int needPoint = 20;

    @Override
    public void handleAction(Person person) {
        if (person.getAge() > needPoint) {
            getNext().handleAction(person);
        } else {
            System.out.println("business NormalLevel");
        }
    }

}
