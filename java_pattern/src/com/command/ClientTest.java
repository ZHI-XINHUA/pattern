package com.command;

/**
 * Created by xh.zhi on 2018-10-15.
 */
public class ClientTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
