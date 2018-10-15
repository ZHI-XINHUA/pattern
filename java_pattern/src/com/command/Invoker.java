package com.command;

/**
 * Created by xh.zhi on 2018-10-15.
 * 请求者角色：负责调用命令对象执行请求
 */
public class Invoker {

    Command command;

    public Invoker(Command command){
        this.command = command;
    }

    /**
     * 行动方法
     */
    public void action(){
        command.excute();
    }
}
