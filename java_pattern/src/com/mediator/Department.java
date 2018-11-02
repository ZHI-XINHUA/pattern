package com.mediator;

/**
 * Created by xh.zhi on 2018-11-2.
 * 部门接口
 * 抽象同事类角色：定义调停者到同事对象的接口。同事对象只知道调停者而不知道其它同事对象
 */
public interface Department {

    /**
     * 自己部门处理的事情
     */
    void myAction();

    /**
     * 向领导汇报的事情
     */
    void outAction();
}
