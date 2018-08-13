package com.mayw.pattendesign20180810.command18;

public class ConcteateCommand extends Command {
    public ConcteateCommand(Receiver receiver) {
        super.receiver = receiver;
    }

    @Override
    public void execute() {
        super.receiver.action();
    }
}
