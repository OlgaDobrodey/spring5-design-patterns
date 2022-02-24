package com.itrex.chapter3.behover.chain;

import com.itrex.chapter3.fasad.Person;

public class ClientMain {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(32);
        LevelHandler normalLevel = new NormalLevel();
        LevelHandler advancedLevel = new AdvancedLevel();
        LevelHandler vipLevel = new VIPLevel();

        normalLevel.setNext(advancedLevel);
        advancedLevel.setNext(vipLevel);

        normalLevel.handleAction(person);
    }

}
