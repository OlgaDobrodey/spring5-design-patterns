package com.itrex.chapter3.behover.command;

public class Command2 implements  Command{

    private Receiver receiver;

    public Command2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.print("This is command 2 ");
        receiver.actionOff();
    }
}
