package com.command;

/**
 * Created by xh.zhi on 2018-10-15.
 * 命令角色：声明了一个给所有具有命令类的抽象接口。
 */
public interface Command {

    /**
     * 执行命令方法
     */
    void excute();
}
