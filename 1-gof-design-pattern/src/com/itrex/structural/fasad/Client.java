package com.itrex.chapter3.fasad;

public class Client {

    public static void main(String[] args) {

        Person doctor = new Person();
        doctor.setRole(Roles.DOCTOR);
        Person patient = new Person();
        patient.setRole(Roles.PATIENT);
        RegistryPolyclinic registryPolyclinic = new RegistryPolyclinic();
        registryPolyclinic.bookPatientToDoctor(doctor,patient);
    }

}
