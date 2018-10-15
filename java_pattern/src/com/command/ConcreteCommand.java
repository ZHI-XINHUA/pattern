package com.command;

/**
 * Created by xh.zhi on 2018-10-15.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void excute() {
        receiver.action();
    }
}
