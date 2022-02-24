package com.itrex.behovioral.observer;

interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObservers();
    void businessLogical();

}
