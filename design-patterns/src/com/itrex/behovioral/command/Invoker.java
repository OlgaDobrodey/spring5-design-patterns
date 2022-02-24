package com.itrex.behovioral.command;

import java.util.List;

public class Invoker {

    public static List<Command> list = List.of(new Command1(new Receiver()), new Command1(new Receiver()));

    void executeCommand(Integer numberCommand) {
        list.get(numberCommand - 1).execute();
    }

}