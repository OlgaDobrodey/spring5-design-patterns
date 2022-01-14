package com.itrex.chapter3.behover.chain;

import com.itrex.chapter3.fasad.Person;

public abstract class LevelHandler {
    protected LevelHandler next;

    public LevelHandler getNext() {
        return next;
    }

    public void setNext(LevelHandler next) {
        this.next = next;
    }

    public abstract void handleAction(Person person);
}

