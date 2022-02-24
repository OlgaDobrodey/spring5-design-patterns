package com.itrex.creational.builder;

public class Runner {

    public static void main(String[] args) {
        User user = User.builder()
                .name("olga")
                .age(33)
                .address("12")
                .build();
        System.out.println(user);

        Person person = Person.builder().name("Olga").age(12).address("12").build();
        System.out.println(person);
    }

}
