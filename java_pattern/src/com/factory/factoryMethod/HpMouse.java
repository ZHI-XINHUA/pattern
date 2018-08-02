package com.factory.factoryMethod;

/**
 * 惠普鼠标（产品角色）
 */
public class HpMouse implements Mouse {
    @Override
    public void wireless() {
        System.out.println("我是惠普无线鼠标！");
    }
}
