package com.factory.factoryMethod;

/**
 * 戴尔工厂类（具体工厂角色）
 */
public class DellMouseFactory implements  MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
