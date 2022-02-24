package com.itrex.chapter3.behover.chain;

import com.itrex.chapter3.fasad.Person;

public class AdvancedLevel extends LevelHandler {

    private static final int needPoint = 30;

    @Override
    public void handleAction(Person person) {
        if (person.getAge()> needPoint) {
            getNext().handleAction(person);
        } else {
            System.out.println("business AdvancedLevel");
        }
    }

}
