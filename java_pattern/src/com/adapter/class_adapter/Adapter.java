package com.adapter.class_adapter;

/**
 * Created by xh.zhi on 2018-8-29.
 * 适配器角色：适配器模式的核心。适配器把源接口转换成目标接口。所以，这是一个类，不可能是接口
 *
 * 类适配：基础被适配的类，实现目标接口
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void operation2() {
        System.out.println("适配的扩展方法:Adapter operation2......");
    }
}
