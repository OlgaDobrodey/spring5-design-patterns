package com.itrex.chapter3.behover.chain;

import com.itrex.chapter3.fasad.Person;

public class VIPLevel extends LevelHandler {

    private static final int needPoint = 40;

    @Override
    public void handleAction(Person person) {

        if (person.getAge() > needPoint) {
            getNext().handleAction(person);
        } else {
            System.out.println("business VIPLevel");
        }
    }

}
