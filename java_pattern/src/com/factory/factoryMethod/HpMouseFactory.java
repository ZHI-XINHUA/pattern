package com.factory.factoryMethod;

/**
 * 惠普工厂类（具体工厂角色）
 */
public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }


}
