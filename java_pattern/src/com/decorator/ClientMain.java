package com.decorator;

public class ClientMain {
    public static void main(String[] args) {
        //原来的对象
        ConcreteComponent component = new ConcreteComponent();
        component.operation();

        //具体装饰A，给职责附加装饰，即给component进行包装
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
        concreteDecoratorA.operation();

        //具体装饰B，给职责附加装饰
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);
        concreteDecoratorB.operation();
    }
}
