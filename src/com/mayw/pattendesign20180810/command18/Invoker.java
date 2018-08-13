package com.mayw.pattendesign20180810.command18;

public class Invoker {
    private Command command;
    public void executeCommand(){
        command.execute();
    }

    public Invoker(Command command) {
        this.command = command;
    }
}
