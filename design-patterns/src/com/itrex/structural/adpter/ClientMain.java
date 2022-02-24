package com.itrex.structural.adpter;

public class ClientMain {

    public static void main(String[] args) {
        Card fleshCard = new FleshCard();
        Adapter adapter = new Adapter(fleshCard);
        adapter.printAboutMemory();
        adapter.getMemory();
        adapter.putMemory();
    }

}
