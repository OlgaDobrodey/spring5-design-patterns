package com.itrex.behovioral.command;

public class Command1 implements Command{
    private Receiver receiver;

    public Command1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.print("This is command 1 ");
        receiver.actionOn();
    }

}
