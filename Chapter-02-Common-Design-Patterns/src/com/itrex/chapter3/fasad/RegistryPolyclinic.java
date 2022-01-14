package com.itrex.chapter3.fasad;

public class RegistryPolyclinic implements RegistryFasad {

    @Override
    public boolean bookPatientToDoctor(Person doctor, Person patient) {

        FreeDateTimePersonService freeDateTimePersonService = new FreeDateTimePersonService();
        freeDateTimePersonService.getFreeTimeForPerson(doctor);
        freeDateTimePersonService.getFreeTimeForPerson(patient);

        return new CheckService().chekPatientToDoctor(doctor, patient);
    }

}

