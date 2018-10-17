package com.command;

/**
 * 命令角色：声明了一个给所有具有命令类的抽象接口。
 */
public interface Command {

    /**
     * 执行命令方法
     * 实际项目中，可以根据需求设计多个不同的方法
     */
    void excute();
}
