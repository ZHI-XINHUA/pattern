package com.command;

/**
 * 真正的命令的执行者
 * 接受者角色：负责具体实施和执行一个请求
 */
public class Receiver {

    public void action(){
        System.out.println(" Receiver>action");
    }
}
