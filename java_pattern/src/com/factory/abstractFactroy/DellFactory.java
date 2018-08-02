package com.factory.abstractFactroy;

/**
 * 戴尔工厂类（具体工厂角色）
 */
public class DellFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public KeyBo createKeyBo() {
        return new DellKeyBo();
    }
}
