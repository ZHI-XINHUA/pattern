package com.decorator;

/**
 * 具体装饰角色：负责给构件对象"粘上"附加的责任
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * 私有的装饰
     */
    private void addDecoratorA(){
        System.out.println("装饰A ConcreteDecoratorA --> addDecoratorA");
    }


    public void operation() {
        //添加装饰
        addDecoratorA();
        super.operation();
    }
}
