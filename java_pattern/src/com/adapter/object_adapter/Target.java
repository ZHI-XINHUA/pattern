package com.adapter.object_adapter;

/**
 * Created by xh.zhi on 2018-8-29.
 * 目标角色：所期待得到的接口。特别注意的是，这里是类适配器模式，目标不可以是类
 */
public interface Target {

    /**
     * 操作1
     */
    void operation1();

    /**
     * 操作2
     */
    void operation2();
}