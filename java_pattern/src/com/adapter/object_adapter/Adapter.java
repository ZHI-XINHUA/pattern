package com.adapter.object_adapter;

/**
 * Created by xh.zhi on 2018-8-29.
 * 适配器角色：适配器模式的核心。适配器把源接口转换成目标接口。所以，这是一个类，不可能是接口
 *
 * 对象适配：使用委派关系，即引用
 */
public class Adapter implements Target {
    //被适配类
    private Adaptee adaptee;


    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void operation1() {
        adaptee.operation1();
    }

    @Override
    public void operation2() {
        System.out.println("适配的扩展方法:Adapter operation2......");
    }
}
