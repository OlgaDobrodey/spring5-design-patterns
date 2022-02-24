package com.itrex.structural.fasad;

import com.itrex.model.Person;

public class CheckService {

    boolean chekPatientToDoctor(Person doctor, Person patient) {
        if (doctor.getFreeTime() && patient.getFreeTime()) {
            System.out.println("Patient book doctor");
            return true;
        } else {
            System.out.println("Patient not book doctor");
            return false;
        }
    }

}
