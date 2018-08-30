package com.decorator;

/**
 * 装饰角色：持有一个构件(Component)对象的实例，并定义一个与抽象构件接口一致的接口
 *
 *
 */
public abstract class Decorator implements Component
{
    //持有Component对象
    private Component component;


    public Decorator(Component component) {
        this.component = component;
    }


    public void operation() {
        component.operation();
    }
}
