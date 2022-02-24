package com.itrex.creational.builder;

import lombok.ToString;

@ToString
public class Person {

    private String name;
    private Integer age;
    private String address;

    Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {

        private String name;
        private Integer age;
        private String address;

        PersonBuilder() {
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(name, age, address);
        }

        public String toString() {
            return "Person.PersonBuilder(name=" + this.name + ", age=" + this.age + ", address=" + this.address + ")";
        }

    }

}
