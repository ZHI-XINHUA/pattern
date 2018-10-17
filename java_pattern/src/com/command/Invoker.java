package com.command;

/**
 * 调用者/发起者
 * 请求者角色：负责调用命令对象执行请求
 */
public class Invoker {

    //也可以通过容器List<Command>容纳很多命令对象，进行批处理。数据库底层的事务管理就是类似的结构！
    Command command;

    public Invoker(Command command){
        this.command = command;
    }

    /**
     * 业务方法 ，用于调用命令类的方法
     */
    public void call(){
        command.excute();
    }
}
