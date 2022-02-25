package com.itrex.reactivedesignspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveDesignSpringBootApplication implements CommandLineRunner {

    @Autowired
    private GreetingClient greetingClient;

    public static void main(String[] args) {

        SpringApplication.run(ReactiveDesignSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(">> message = " + greetingClient.getMessage().block());
    }
}
