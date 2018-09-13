package com.decorator;

/**
 * 具体构件角色：定义一个将要接收附加责任的类
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println(" ConcreteComponent  --> operation()");
    }
}
