package com.itrex.behovioral.command;

//example button (save update and else)
public class Client {

    public static void main(String[] args) {

        //invoke consist all command
        Invoker invoker = new Invoker();
        //execute command number 1 or 2
        invoker.executeCommand(1);
    }

}
