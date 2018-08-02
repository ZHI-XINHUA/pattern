package com.factory.factoryMethod;

/**
 * 戴尔鼠标类（产品角色）
 */
public class DellMouse implements Mouse
{
    @Override
    public void wireless() {
        System.out.println("我是戴尔无线鼠标!");
    }
}
