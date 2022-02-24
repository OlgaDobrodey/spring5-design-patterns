package com.itrex.structural.adpter;

// Adapter fot two incompatible classes Laptop and Card
public class Adapter implements Laptop {

    private Card card;

    public Adapter(Card card) {
        this.card = card;
    }

    @Override
    public void getMemory() {
        card.getCard();
    }

    @Override
    public void putMemory() {
        card.putCard();
    }

    @Override
    public void printAboutMemory() {
        card.putCard();
        card.getCard();
    }

}
