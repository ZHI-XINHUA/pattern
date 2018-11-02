package com.mediator;

/**
 * Created by xh.zhi on 2018-11-2.
 *  行政领导接口
 *  抽象调停者角色：定义出同事对象到调停者对象的接口
 */
public interface ExecutiveLeader {
    /**
     * 组织架构，管理协调部门
     * @param dname
     * @param d
     */
    void register(String dname,Department d);

    /**
     * 指示命令
     * @param dname
     */
    void command(String dname);
}
