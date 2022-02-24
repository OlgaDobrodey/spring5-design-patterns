package com.itrex.behovioral.chain;

import com.itrex.model.Person;

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

