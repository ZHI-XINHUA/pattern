package com.command;

/**
 * 具体命令角色：定义一个接受者和行为之间的弱耦合；负责调用接受者的响应操作
 */
public class ConcreteCommand implements Command {
    //命令的真正的执行者
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    //命令真正执行
    @Override
    public void excute() {
        System.out.println("===记录命令执行前的日志====>");
        receiver.action();
        System.out.println("===记录命令执行后的日志====>");
    }
}
