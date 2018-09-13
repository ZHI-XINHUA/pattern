package com.decorator;

/**
 * 具体装饰角色：负责给构件对象"粘上"附加的责任
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    /**
     * 私有的装饰
     */
    private void addDecoratorB(){
        System.out.println("装饰A ConcreteDecoratorB --> addDecoratorB");
    }


    public void operation() {
        //添加装饰
        addDecoratorB();
        super.operation();
    }
}
