package com.mayw.pattendesign20180810.command18;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcteateCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.executeCommand();

    }

}
