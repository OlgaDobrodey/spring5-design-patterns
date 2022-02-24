package com.itrex.structural.fasad;

import com.itrex.model.Person;

public class FreeDateTimePersonService {

    void getFreeTimeForPerson(Person person) {
        int count = (int) (Math.random() * 10);
        if (count > 5) {
            person.setFreeTime(true);
        } else {
            person.setFreeTime(false);
        }
        System.out.println(person.getRole()+" - " + count);
    }

}
