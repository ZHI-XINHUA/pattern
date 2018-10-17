package com.command;

/**
 * Created by xh.zhi on 2018-10-15.
 */
public class ClientTest {
    public static void main(String[] args) {
        //创建一个接受者
        Receiver receiver = new Receiver();
        //创建命令，并且给接受者执行
        Command command = new ConcreteCommand(receiver);

        //命令发起人，发起命令
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}
