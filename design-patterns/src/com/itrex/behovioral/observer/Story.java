package com.itrex.behovioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Story implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Call all");
        observers.forEach(Observer::update);
    }

    @Override
    public void businessLogical() {
        System.out.println("Anything action");
        notifyObservers();
    }

}
