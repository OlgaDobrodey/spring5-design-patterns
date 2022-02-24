package com.itrex.structural.fasad;

import com.itrex.model.Person;

public interface RegistryFasad {

    boolean bookPatientToDoctor(Person doctor, Person patient);

}
