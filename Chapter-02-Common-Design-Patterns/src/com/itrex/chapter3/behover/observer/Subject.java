package com.itrex.chapter3.behover.observer;

interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObservers();
    void businessLogical();

}
