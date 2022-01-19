package com.packt.patterninspring.chapter5.bpp.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope("prototype")
public class MyExperimentPrototypeServiceImpl implements MyService {

    @PostConstruct
    void populateCache() {
        System.out.println("Called populateCache() method " + this.getClass().getSimpleName());
    }
//    Never called in Prototype
    @PreDestroy
    void clearCache() {
        System.out.println("Called clearCache() method "+ this.getClass().getSimpleName());
    }

}

